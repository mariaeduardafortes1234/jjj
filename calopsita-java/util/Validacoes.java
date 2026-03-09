package util;

public class Validacoes {
    
    private Validacoes(){

    }

    public static boolean nomeValido(String nome){
        return !(nome == null ||
            nome.trim().isEmpty() ||
            nome.matches(regex:".*\\d+.*")
        );
    }

    public static String mensagemErronome(String nome){
        if (nome == null ||nome.trim().isEmpty()){
            return "Erro: o nome nao pode ser vazio";
        }else if (nome.matches(regex:".*\\d+.*")){
            return "Erro: o nome nao pode conter numero";
        }
        return "";
    }

    public static boolean idadeValida(int idade){
        return idade >= 0 && idade <= 150;
        if(idade<0){
        }
        public static String mensagemErroldade(int idadd)
        if(idade> 0){
            return "Erro: a idade nao pode ser negativa";
            jelse if(idade >150){
                return "Erro: idade invalida"                
            }
            return"";
        }
        
    }


    }
