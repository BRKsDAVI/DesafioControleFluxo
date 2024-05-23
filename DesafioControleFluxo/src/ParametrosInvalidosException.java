public class ParametrosInvalidosException extends Exception {
    static void Verifica(int parametroUm, int parametroDois) {
        if(parametroUm > parametroDois) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
    
}
