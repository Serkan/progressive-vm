// Generated from /home/serkan/dev/progressive-vm/src/main/resources/Massive.g4 by ANTLR 4.5
package org.test.gen;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MassiveParser}.
 */
public interface MassiveListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MassiveParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull MassiveParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MassiveParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull MassiveParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MassiveParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull MassiveParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MassiveParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull MassiveParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MassiveParser#assign_stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stat(@NotNull MassiveParser.Assign_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link MassiveParser#assign_stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stat(@NotNull MassiveParser.Assign_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link MassiveParser#return_stat}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stat(@NotNull MassiveParser.Return_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link MassiveParser#return_stat}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stat(@NotNull MassiveParser.Return_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logical_exp}
	 * labeled alternative in {@link MassiveParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLogical_exp(@NotNull MassiveParser.Logical_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logical_exp}
	 * labeled alternative in {@link MassiveParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLogical_exp(@NotNull MassiveParser.Logical_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operand_exp}
	 * labeled alternative in {@link MassiveParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterOperand_exp(@NotNull MassiveParser.Operand_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operand_exp}
	 * labeled alternative in {@link MassiveParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitOperand_exp(@NotNull MassiveParser.Operand_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nested_exp}
	 * labeled alternative in {@link MassiveParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNested_exp(@NotNull MassiveParser.Nested_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nested_exp}
	 * labeled alternative in {@link MassiveParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNested_exp(@NotNull MassiveParser.Nested_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equality_exp}
	 * labeled alternative in {@link MassiveParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterEquality_exp(@NotNull MassiveParser.Equality_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equality_exp}
	 * labeled alternative in {@link MassiveParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitEquality_exp(@NotNull MassiveParser.Equality_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmetic_exp}
	 * labeled alternative in {@link MassiveParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_exp(@NotNull MassiveParser.Arithmetic_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmetic_exp}
	 * labeled alternative in {@link MassiveParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_exp(@NotNull MassiveParser.Arithmetic_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function_call_exp}
	 * labeled alternative in {@link MassiveParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_exp(@NotNull MassiveParser.Function_call_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function_call_exp}
	 * labeled alternative in {@link MassiveParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_exp(@NotNull MassiveParser.Function_call_expContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relational_exp}
	 * labeled alternative in {@link MassiveParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterRelational_exp(@NotNull MassiveParser.Relational_expContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relational_exp}
	 * labeled alternative in {@link MassiveParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitRelational_exp(@NotNull MassiveParser.Relational_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link MassiveParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(@NotNull MassiveParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link MassiveParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(@NotNull MassiveParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string_literal}
	 * labeled alternative in {@link MassiveParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(@NotNull MassiveParser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string_literal}
	 * labeled alternative in {@link MassiveParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(@NotNull MassiveParser.String_literalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number_literal}
	 * labeled alternative in {@link MassiveParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterNumber_literal(@NotNull MassiveParser.Number_literalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number_literal}
	 * labeled alternative in {@link MassiveParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitNumber_literal(@NotNull MassiveParser.Number_literalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolean_literal}
	 * labeled alternative in {@link MassiveParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(@NotNull MassiveParser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolean_literal}
	 * labeled alternative in {@link MassiveParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(@NotNull MassiveParser.Boolean_literalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id_operand}
	 * labeled alternative in {@link MassiveParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterId_operand(@NotNull MassiveParser.Id_operandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id_operand}
	 * labeled alternative in {@link MassiveParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitId_operand(@NotNull MassiveParser.Id_operandContext ctx);
}