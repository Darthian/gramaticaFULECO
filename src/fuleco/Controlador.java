package fuleco;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Controlador {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		/*
		System.out.println("Inicia el programa");
		
		ANTLRInputStream input = new ANTLRInputStream(System.in); 
		System.out.println("Instanciacion del INPUT");
		
		FulecoLexer lexer = new FulecoLexer(input);
		System.out.println("Instanciacion del LEXER");
		
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		System.out.println("Instanciacion de los TOKENS");
		
		FulecoParser parser = new FulecoParser(tokens);
		System.out.println("Instanciacion del PARSER");
		
		ParseTree tree = parser.programa();
		System.out.println("Instanciacion del ARBOL segun la REGLA PROGRAMA");
		
//		EvalVisitor eval = new EvalVisitor();
		
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(new ShortToUnicodeString(), tree);
		
//		System.out.println(tree.toStringTree(parser)); // print LISP-style tree
		System.out.println();
		*/
		
		Fuleco_v2Lexer lexer = new Fuleco_v2Lexer(new ANTLRFileStream("/Users/ian/Documents/ANTLR/fuleco/CODIGO_FULECO.txt"));
		Fuleco_v2Parser parser = new Fuleco_v2Parser(new CommonTokenStream(lexer));
		ParseTree tree = parser.parse();
		EvalVisitor visitor = new EvalVisitor();
		visitor.visit(tree);
	}

}
