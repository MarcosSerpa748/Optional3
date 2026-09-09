public class Main {
    public static void main(String[] args) {
        Integer idade = MetodosEstaticos.retornarUmaIdade().orElseGet(() -> MetodosEstaticos.retornarIdadePadrao());

        System.out.println("Idade:"+idade);
    }
}