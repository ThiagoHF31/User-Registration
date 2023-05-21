package com.empresa;
import java.util.Scanner;
import com.empresa.Register.userRegister;
import com.empresa.services.UserService;
import com.empresa.models.User;
import java.util.List;

public class Main{
    public static void main(String[] args){

        userRegister UserRegister = new userRegister();
        User user = new User();
        UserService userService = new UserService();

        int tag=0;
        Scanner reader = new Scanner(System.in);

        do{
            System.out.println();
            System.out.println("[0]- Sair \n[1]- Cadastrar \n[2]- Mostrar Cadastros\n");
            System.out.println("Digite uma opção válida: ");
            tag = Integer.parseInt(reader.nextLine());

            switch(tag){
                case 0:
                    System.out.println("Saindo do programa do programa!");
                    break;
                case 1:
                    user = UserRegister.store();
                    userService.store(user);
                    break;
                case 2:
                    List<User> users = userService.index();
                    System.out.println();
                    if(users.size()==0){
                        System.out.println("_____________________");
                        System.out.println("LIsta Vazia! ");
                        System.out.println("_____________________");

                    }else{
                        System.out.println("_____________________");
                        System.out.println("Lista de usuários.");
                        System.out.println();
                        for(int i=0; i<users.size(); i++){
                            System.out.println("Id: "+users.get(i).getId());
                            System.out.println("Name: "+users.get(i).getName());
                            System.out.println("Age: "+users.get(i).getAge());
                            System.out.println();
                        }
                        System.out.println("------------------------------------");
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }while(tag != 0);

        reader.close();
    }
    
}