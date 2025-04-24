import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PalindromoUserStoryTest {
    
     @Test
     void deveRetornarSimParaPalindromoSimples() {
         
         String palavra = "ana";
         
         String resultado = ValidadorPalindromo.verificarPalindromo(palavra);
         
         assertEquals("Sim", resultado);
     }
     
     @Test
     void deveRetornarNaoParaNaoPalindromo() {
         
         String palavra = "casa";
         
         String resultado = ValidadorPalindromo.verificarPalindromo(palavra);
         
         assertEquals("Não", resultado);
     }
     
     @Test
    void deveIgnorarMaiusculasMinusculasEspacosEPontuacao() {
        
        String frase = "Socorram-me, subi no ônibus em Marrocos!";
        
        String resultado = ValidadorPalindromo.verificarPalindromo(frase);
        
        assertEquals("Sim", resultado);
    }
    
     @Test
    void deveRetornarSimParaStringVazia() {

        String texto = "";
        
        String resultado = ValidadorPalindromo.verificarPalindromo(texto);
        
        assertEquals("Sim", resultado);
    }
    
     @Test
    void deveRetornarSimParaPalindromoComAcentos() {

        String palavra = "Açã";

        String resultado = ValidadorPalindromo.verificarPalindromo(palavra);

        assertEquals("Sim", resultado);
    }
}
