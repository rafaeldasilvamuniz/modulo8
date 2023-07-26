/**Classe para o cálculo da média dos valores.
 *@author : Rafael da Silva Muniz
 *@since : 26/07/23
 */

public class Calculo {

    private float md = 0.0f;

    private int n1 = 10;
    private int n2 = 30;
    private int n3 = 50;
    private int n4 = 80;

    public float retornaMedia() {
        md = (n1 + n2 + n3 + n4)/4;
        return md;

    }


}
