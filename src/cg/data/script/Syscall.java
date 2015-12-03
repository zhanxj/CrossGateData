package cg.data.script;

import java.io.File;
import java.io.FileReader;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import cg.data.script.antlr.GMSVBaseListener;
import cg.data.script.antlr.GMSVLexer;
import cg.data.script.antlr.GMSVParser;
import cg.data.script.antlr.GMSVParser.BlockContext;
import cg.data.script.antlr.GMSVParser.StrcmpchatContext;

public class Syscall {
	
	public static void main(String[] args) {
		try {
			ANTLRInputStream in = new ANTLRInputStream(new FileReader(new File("D:/file/workspace/CrossGateResource/npc/EV_aoki_6515.txt")));
			GMSVLexer lexer = new GMSVLexer(in);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			GMSVParser parse = new GMSVParser(tokens);
			BlockContext blockContext = parse.block();
			blockContext.enterRule(new GMSVBaseListener(){
	
				@Override
				public void enterBlock(BlockContext ctx) {
					System.out.println(ctx.getText());
					for (int i = 0, loop = ctx.getChildCount();i < loop;i++) {
						System.out.println(ctx.getChild(i));
					}
				}
				
			});
			StrcmpchatContext strcmpchatContext = parse.strcmpchat();
			strcmpchatContext.enterRule(new GMSVBaseListener() {

				@Override
				public void enterStrcmpchat(StrcmpchatContext ctx) {
					System.out.println(ctx.getText());
				}
				
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
