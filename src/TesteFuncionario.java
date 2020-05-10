public class TesteFuncionario {
    public static void main(String[] args) {

        Gerente gerente = new Gerente();

        gerente.setNome("Fulano");
        gerente.setCpf("000.000.000-99");
        gerente.setSalario(4000.0);
        gerente.setSenha(123);

        System.out.println(gerente.getSalario());

    }
}
