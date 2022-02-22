package acc.familia;

public class Principal {
    public static void main(String[] args) {
        Avo avo = new Avo();
        
        avo.setNome("Avo");
        System.out.println(avo.getProfissao());

        Pai pai = new Pai();
        pai.setNome("Pai");
//        pai.setProfissao("Analista");
        System.out.println(pai.getProfissao());

    	Filho filho = new Filho();
        filho.setNome("Filho");
        System.out.println(filho.getProfissao());
        
        filho.seApresentar();
        pai.seApresentar();
        avo.seApresentar();
        
//      System.out.println(((Avo) filho).getNome());
    }
}