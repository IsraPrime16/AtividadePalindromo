import java.text.Normalizer;

public class ValidadorPalindromo {
  public static String verificarPalindromo(String texto) {
    if (texto == null) {
      return "Não";
    }

  String textoNormalizado = normalizarTexto(texto);

  int esquerda = 0;
  int direita = textoNormalizado.length() -1;

  while (esquerda < direita) {
    if (textoNormalizado.charAt(esquerda) != textoNormalizado.charAt(direita)) {
        return "Não";
    }
    esquerda++;
    direita--;
  }

  return "Sim";
}

  private static String normalizarTexto(String texto) {
    String textoNormalizado = Normalizer.normalize(texto, Normalizer.Form.NFD).replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
    textoNormalizado = textoNormalizado.replaceAll("[^a-zA-z0-9]","");
    return textoNormalizado.toLowerCase();
  }

  public static boolean ehPalindromo(String texto) {
    return verificarPalindromo(texto).equals("Sim");
  }
}
