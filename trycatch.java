/*
TRY _ CATCH _ FINALLY
tratamento de erros;
*/
//                             é
class ErroParametroNegativo extends Exception {
    public int id;
    public String getMessage() {
        return "Algum número negativo foi passado como parâmetro.";
    }
}

class ErroAIgualAZero extends Exception {
}

class OperacaoMatematica {
    public double soma(double a, double b) throws ErroParametroNegativo,ErroAIgualAZero   {
        if(a < 0 || b < 0) {
            ErroParametroNegativo erro = new ErroParametroNegativo();
            throw erro;
        }
        if(a == 0) {
            throw new ErroAIgualAZero();
        }
        return a + b;
    }

    public int subtracaoNegativa(int a, int b) throws Exception {
        if(a >= 0 || b >= 0) {
            throw new Exception("Não pode valores positivos nesse método.");
        }
        return a - b;
    }
}

class Main {
    public static void main(String args[]) {
        OperacaoMatematica op = new OperacaoMatematica();
        double r = 0;
        int p = 0;
        try {
            System.out.println("Antes de tudo");
            r = op.soma(2.5, -3.0);
            p = op.subtracaoNegativa(-1, -2); 
        } catch(ErroParametroNegativo e) {
            System.out.println("Algum parametro errado: " + e.getMessage());
        } catch(ErroAIgualAZero e1) {
            System.out.println("O a é igual a zero em algum lugar");
        } catch(Exception e2) {
            System.out.println("Erro geral: " + e2.getMessage());
        } finally {
            System.out.println("r = " + r);
            System.out.println("p = " + p);
        }
        System.out.println("fim");
    }
}