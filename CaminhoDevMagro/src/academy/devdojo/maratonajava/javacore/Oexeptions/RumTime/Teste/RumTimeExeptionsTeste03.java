package academy.devdojo.maratonajava.javacore.Oexeptions.RumTime.Teste;
// durante a criacao do try ele so pode ser usado se tiver ou o finaly ou o catch
// tem que ser ou try-finaly: menos usada
// ou try-catch
public class RumTimeExeptionsTeste03 {
    public static void main(String[] args) {
        abreConexao();
    }
        private static String abreConexao(){
            try{
                System.out.println("Abrindo arquivos");
                System.out.println("Escrevendo dados nos arquivos");
                return "Conexao aberta";
            }catch (Exception e){
                e.printStackTrace();
     // bloco de codigo que sempre sera executado
            }finally {
                System.out.println("Fechando recurso liberado pelo SO");
            }
            return null;
        }

    }


