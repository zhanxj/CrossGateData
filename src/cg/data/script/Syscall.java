package cg.data.script;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import cg.data.script.antlr.GMSVBaseListener;
import cg.data.script.antlr.GMSVLexer;
import cg.data.script.antlr.GMSVParser;
import cg.data.script.antlr.GMSVParser.BlockContext;

public class Syscall {
	
	public static void main(String[] args) {
		ANTLRInputStream in = new ANTLRInputStream("total 1\rblock total");
		GMSVLexer lexer = new GMSVLexer(in);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		GMSVParser parse = new GMSVParser(tokens);
		BlockContext context = parse.block();
		context.enterRule(new GMSVBaseListener(){

			@Override
			public void enterBlock(BlockContext ctx) {
				super.enterBlock(ctx);
				System.out.println(ctx.getText());
//				System.out.println(ctx.ID());
			}
			
		});
	}

}
