package fuleco;

public class ShortToUnicodeString extends FulecoBaseListener {
	@Override
	public void enterPrograma(FulecoParser.ProgramaContext ctx){System.out.print("''");}
	
	@Override
	public void exitPrograma(FulecoParser.ProgramaContext ctx){System.out.print("''");}
}
