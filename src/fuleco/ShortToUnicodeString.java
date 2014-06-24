package fuleco;

public class ShortToUnicodeString extends Fuleco_v3BaseListener {
	@Override
	public void enterPrograma(Fuleco_v3Parser.ProgramaContext ctx){System.out.print("''");}
	
	@Override
	public void exitPrograma(Fuleco_v3Parser.ProgramaContext ctx){System.out.print("''");}
}
