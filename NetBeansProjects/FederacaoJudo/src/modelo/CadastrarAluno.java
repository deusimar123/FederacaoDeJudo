package modelo;

import controle.DAO;

/**
 *
 * @author deusimar
 */
public class CadastrarAluno {
    
    Pessoa p = new Pessoa();
    
    public boolean DadosCadastroAluno(String nome, String nome_mae, String telefone,
                                        String data_ourtoga, String idade,
                                        String competicoes, String nome_pai,
                                        String path, String cpf, String nome_academia,
                                        String peso, String graduacao, String sexo
                                        ){
        
        if(nome.equals("") || nome.length() < 12){
            return false;
        }else if(nome_mae.equals("") || nome_mae.length() < 12){
            return false;
        }else if(cpf.equals("") || !Validar.isCPF(cpf) || cpf.length() != 11){
            return false;
        }else if(!peso.equals("")  && !peso.contains("^[a-Z]")){
                    if(Float.valueOf(peso.replace(",", ".")) < 10){
                        return false;
                    }else{
                        //peso recebe valor
                    }
        }else if(peso.equals("")  || peso.contains("^[a-Z]")){
            return false;
        }else if(data_ourtoga.equals("")){
            return false;
        }else if(idade.equals("")){
            return false;
        }else if(competicoes.equals("")){
            return false;
        }else if(path.equals("")){
            return false;
        }else if(nome_academia.equals("")){
            return false;
        }else if(graduacao.equals("")){
            return false;
        }else if(sexo.equals("")){
            return false;
        }else if(!nome_pai.equals("")){
               
        }
        
        
//        p.setNomeCompleto(nome);
//        p.setNomeMae(nome_mae);
//        
//        if(!new DAO().createPessoa(p)){
//            return false;
//        }
        
        return true;
    }
        
}