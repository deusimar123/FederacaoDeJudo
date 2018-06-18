package br.tests.FederacaoJudo;

import modelo.Academia;
import modelo.CadastrarAcademia;
import org.junit.After;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author deusimar
 */
public class CadastrarAcademiaTest {
    
        CadastrarAcademia a; 
        Academia ac;
    
        @Before
        public void setup() {
            a = new CadastrarAcademia();
            ac = new Academia();
        }

        @After
        public void teardown() {
            a = null;
        }
        
        @Test
        public void testCadastroAcademiaValido(){
            
            ac.setBairro("Junco");
            ac.setCep("64607-755");
            ac.setCidade("Picos");
            ac.setEstado("Piauí");
            ac.setNomeAcademia("Academia Sol");
            ac.setNumero(4045);
            ac.setRua("Av. Senador Helvídio Nunes");
            
            assertTrue("Deveria Passar", a.DadosCadastroAcademia(ac));
            
        }
        
        @Test
        public void testCadastroAcademiaInvalido(){
            
            ac.setBairro("");
            ac.setEstado("");
            ac.setCep("");
            ac.setCidade("");
            ac.setNomeAcademia("");
            ac.setNumero(4045);
            ac.setRua("");
            
            assertFalse("Nao Deveria Passar", a.DadosCadastroAcademia(ac));
            
        }
        
        @Test
        public void testNomeAcademiaInvalido(){
            
            ac.setBairro("Junco");
            ac.setEstado("Piauí");
            ac.setCep("64607-755");
            ac.setCidade("Picos");
            ac.setNomeAcademia("Academia Do 1Vale");
            ac.setNumero(4045);
            ac.setRua("Av. Senador Helvídio Nunes");
            
            assertFalse("Nao Deveria Passar", a.DadosCadastroAcademia(ac));
            
        }
        
        @Test
        public void testRuaAcademiaInvalida(){
            
            ac.setBairro("Junco");
            ac.setEstado("Piauí");
            ac.setCep("64607-755");
            ac.setCidade("Picos");
            ac.setNomeAcademia("Academia Do Vale");
            ac.setNumero(4045);
            ac.setRua("Av. 1Senador Helvídio 1Nunes");
            
            assertFalse("Nao Deveria Passar", a.DadosCadastroAcademia(ac));
            
        }
        
        @Test
        public void testNumeroAcademiaInvalido(){
            
            ac.setBairro("Junco");
            ac.setEstado("Piauí");
            ac.setCep("64607-755");
            ac.setCidade("Picos");
            ac.setNomeAcademia("Academia Do Vale");
            ac.setNumero(-1);
            ac.setRua("Av. Senador Helvídio Nunes");
            
            assertFalse("Nao Deveria Passar", a.DadosCadastroAcademia(ac));
            
        }
        
        @Test
        public void testCidadeAcademiaInvalida(){
            
            ac.setBairro("Junco");
            ac.setEstado("Piauí");
            ac.setCep("64607-755");
            ac.setCidade("Picos1");
            ac.setNomeAcademia("Academia Do Vale");
            ac.setNumero(4045);
            ac.setRua("Av. Senador Helvídio Nunes");
            
            assertFalse("Nao Deveria Passar", a.DadosCadastroAcademia(ac));
            
        }
        
        @Test
        public void testCepAcademiaInvalido(){
            
            ac.setBairro("Junco");
            ac.setEstado("Piauí");
            ac.setCep("64607-75a");
            ac.setCidade("Picos");
            ac.setNomeAcademia("Academia Do Vale");
            ac.setNumero(4045);
            ac.setRua("Av. Senador Helvídio Nunes");
            
            assertFalse("Nao Deveria Passar", a.DadosCadastroAcademia(ac));
            
        }
        
        @Test
        public void testBairroAcademiaInvalido(){
            
            ac.setBairro("Junc0");
            ac.setEstado("Piauí");
            ac.setCep("64607-755");
            ac.setCidade("Picos");
            ac.setNomeAcademia("Academia Do Vale");
            ac.setNumero(4045);
            ac.setRua("Av. Senador Helvídio Nunes");
            
            assertFalse("Nao Deveria Passar", a.DadosCadastroAcademia(ac));
            
        }
        
        @Test
        public void testEstadoAcademiaInvalido(){
            
            ac.setBairro("Junco");
            ac.setEstado("Piau1");
            ac.setCep("64607-755");
            ac.setCidade("Picos");
            ac.setNomeAcademia("Academia Do Vale");
            ac.setNumero(4045);
            ac.setRua("Av. Senador Helvídio Nunes");
            
            assertFalse("Nao Deveria Passar", a.DadosCadastroAcademia(ac));
            
        }
}
