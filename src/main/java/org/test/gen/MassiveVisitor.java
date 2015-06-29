// Generated from /home/serkan/dev/progressive-vm/src/main/resources/Massive.g4 by ANTLR 4.5
package org.test.gen;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MassiveParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MassiveVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MassiveParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull MassiveParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MassiveParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(@NotNull MassiveParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MassiveParser#assign_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stat(@NotNull MassiveParser.Assign_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link MassiveParser#return_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stat(@NotNull MassiveParser.Return_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logical_exp}
	 * labeled alternative in {@link MassiveParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_exp(@NotNull MassiveParser.Logical_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operand_exp}
	 * labeled alternative in {@link MassiveParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand_exp(@NotNull MassiveParser.Operand_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nested_exp}
	 * labeled alternative in {@link MassiveParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNested_exp(@NotNull MassiveParser.Nested_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equality_exp}
	 * labeled alternative in {@link MassiveParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_exp(@NotNull MassiveParser.Equality_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmetic_exp}
	 * labeled alternative in {@link MassiveParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_exp(@NotNull MassiveParser.Arithmetic_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function_call_exp}
	 * labeled alternative in {@link MassiveParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_exp(@NotNull MassiveParser.Function_call_expContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relational_exp}
	 * labeled alternative in {@link MassiveParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_exp(@NotNull MassiveParser.Relational_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link MassiveParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(@NotNull MassiveParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string_literal}
	 * labeled alternative in {@link MassiveParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_literal(@NotNull MassiveParser.String_literalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number_literal}
	 * labeled alternative in {@link MassiveParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_literal(@NotNull MassiveParser.Number_literalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolean_literal}
	 * labeled alternative in {@link MassiveParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_literal(@NotNull MassiveParser.Boolean_literalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id_operand}
	 * labeled alternative in {@link MassiveParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_operand(@NotNull MassiveParser.Id_operandContext ctx);
}