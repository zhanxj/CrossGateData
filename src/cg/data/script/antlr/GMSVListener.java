package cg.data.script.antlr;
// Generated from cg/data/script/antlr/GMSV.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GMSVParser}.
 */
public interface GMSVListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GMSVParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(GMSVParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(GMSVParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link GMSVParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GMSVParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GMSVParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GMSVParser.BlockContext ctx);
}