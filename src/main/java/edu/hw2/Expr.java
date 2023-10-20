package edu.hw2;

public sealed interface Expr {
    double evaluate();

    public record Constant(int number) implements Expr {

        @Override
        public double evaluate() {
            return number;
        }
    }
    public record Negate(Expr expression) implements Expr {

        @Override
        public double evaluate() {
            return - expression.evaluate();
        }
    }
    public record Exponent(Expr expression1, Expr expression2) implements Expr {

        @Override
        public double evaluate() {
            return Math.pow(expression1.evaluate(), expression2.evaluate());
        }
    }
    public record Addition(Expr expression1, Expr expression2) implements Expr {

        @Override
        public double evaluate() {
            return expression1.evaluate() + expression2.evaluate();
        }
    }
    public record Multiplication(Expr expression1, Expr expression2) implements Expr {

        @Override
        public double evaluate() {
            return expression1.evaluate() * expression2.evaluate();
        }
    }
}
