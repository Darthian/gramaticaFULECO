package fuleco;

public class ShortToUnicodeString extends Fuleco_v2BaseListener {
	@Override
	public void enterPrograma(Fuleco_v2Parser.ProgramaContext ctx){System.out.print("''");}
	
	@Override
	public void exitPrograma(Fuleco_v2Parser.ProgramaContext ctx){System.out.print("''");}
}
