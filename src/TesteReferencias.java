public class TesteReferencias {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("Luan");
        gerente.setSalario(5000);

        EditorDeVideo editorDeVideo = new EditorDeVideo();
        editorDeVideo.setNome("Lucas");
        editorDeVideo.setSalario(300.0);

        ControleBonificacao controleBonificacao = new ControleBonificacao();
        controleBonificacao.registra(editorDeVideo);


        System.out.println("Qual a soma: " + controleBonificacao.getSoma());



    }
}
