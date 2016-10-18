package com.theironyard;

import com.github.javaparser.ParseException;
import net.doughughes.testifier.annotation.Testifier;
import net.doughughes.testifier.matcher.RegexMatcher;
import net.doughughes.testifier.util.SourceCodeExtractor;
import net.doughughes.testifier.util.TestifierAnnotationReader;
import net.doughughes.testifier.watcher.NotifyingWatcher;
import net.doughughes.testifier.watcher.OutputWatcher;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

@Testifier(sourcePath = "./src/main/java/com/theironyard/ArithmeticOperators.java", clazz = ArithmeticOperators.class)
public class ArithmeticOperatorsTest {

    @Rule
    public NotifyingWatcher notifyingWatcher = new NotifyingWatcher("https://tiy-testifier-webapp.herokuapp.com/notify");

    @Rule
    public OutputWatcher outputWatcher = new OutputWatcher();

    @Test
    @Testifier(method = "addTwoIntegers", args = {})
    public void addTwoIntegersCodeStructureTest() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        ArithmeticOperators.addTwoIntegers();

        /* assert */
        // read this test's annotations
        TestifierAnnotationReader reader = new TestifierAnnotationReader(
                this.getClass().getAnnotation(Testifier.class),
                this.getClass().getMethod("addTwoIntegersCodeStructureTest").getAnnotation(Testifier.class)
        );

        // check the structure of the code
        String methodDescription = new SourceCodeExtractor(reader.getSourcePath()).getMethodDescription(reader.getMethod(), reader.getArgs());
        Assert.assertThat("The method should add two integers together",
                methodDescription, RegexMatcher.matches("^.*?(UnaryExpr\\[.*?\\] )?IntegerLiteralExpr\\[[0-9]+?\\] plus (UnaryExpr\\[.*?\\] )?IntegerLiteralExpr\\[[0-9]+?\\].*?$"));
    }

    @Test
    @Testifier(method = "addThreeIntegers", args = {})
    public void addThreeIntegersCodeStructureTest() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        ArithmeticOperators.addThreeIntegers();

        /* assert */
        // read this test's annotations
        TestifierAnnotationReader reader = new TestifierAnnotationReader(
                this.getClass().getAnnotation(Testifier.class),
                this.getClass().getMethod("addThreeIntegersCodeStructureTest").getAnnotation(Testifier.class)
        );

        // check the structure of the code
        String methodDescription = new SourceCodeExtractor(reader.getSourcePath()).getMethodDescription(reader.getMethod(), reader.getArgs());
        Assert.assertThat("The method should add three integers together",
                methodDescription, RegexMatcher.matches("^.*?(UnaryExpr\\[.*?\\] )?IntegerLiteralExpr\\[[0-9]+?\\] plus (UnaryExpr\\[.*?\\] )?IntegerLiteralExpr\\[[0-9]+?\\] plus (UnaryExpr\\[.*?\\] )?IntegerLiteralExpr\\[[0-9]+?\\].*?$"));
    }

    @Test
    @Testifier(method = "addTwoDoubles", args = {})
    public void addTwoDoublesCodeStructureTest() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        ArithmeticOperators.addTwoDoubles();

        /* assert */
        // read this test's annotations
        TestifierAnnotationReader reader = new TestifierAnnotationReader(
                this.getClass().getAnnotation(Testifier.class),
                this.getClass().getMethod("addTwoDoublesCodeStructureTest").getAnnotation(Testifier.class)
        );

        // check the structure of the code
        String methodDescription = new SourceCodeExtractor(reader.getSourcePath()).getMethodDescription(reader.getMethod(), reader.getArgs());
        Assert.assertThat("The method should add two doubles",
                methodDescription, RegexMatcher.matches("^.*?(UnaryExpr\\[.*?\\] )?DoubleLiteralExpr\\[[0-9.d]+?\\] plus (UnaryExpr\\[.*?\\] )?DoubleLiteralExpr\\[[0-9.d]+?\\].*?$"));
    }

    @Test
    @Testifier(method = "addThreeDoubles", args = {})
    public void addThreeDoublesCodeStructureTest() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        ArithmeticOperators.addThreeDoubles();

        /* assert */
        // read this test's annotations
        TestifierAnnotationReader reader = new TestifierAnnotationReader(
                this.getClass().getAnnotation(Testifier.class),
                this.getClass().getMethod("addThreeDoublesCodeStructureTest").getAnnotation(Testifier.class)
        );

        // check the structure of the code
        String methodDescription = new SourceCodeExtractor(reader.getSourcePath()).getMethodDescription(reader.getMethod(), reader.getArgs());
        Assert.assertThat("The method should add three doubles",
                methodDescription, RegexMatcher.matches("^.*?(UnaryExpr\\[.*?\\] )?DoubleLiteralExpr\\[[0-9.d]+?\\] plus (UnaryExpr\\[.*?\\] )?DoubleLiteralExpr\\[[0-9.d]+?\\] plus (UnaryExpr\\[.*?\\] )?DoubleLiteralExpr\\[[0-9.d]+?\\].*?$"));
    }

    @Test
    @Testifier(method = "addANegativeAndPositiveNumber", args = {})
    public void addANegativeAndPositiveNumberCodeStructureTest() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        ArithmeticOperators.addANegativeAndPositiveNumber();

        /* assert */
        // read this test's annotations
        TestifierAnnotationReader reader = new TestifierAnnotationReader(
                this.getClass().getAnnotation(Testifier.class),
                this.getClass().getMethod("addANegativeAndPositiveNumberCodeStructureTest").getAnnotation(Testifier.class)
        );

        // check the structure of the code
        String methodDescription = new SourceCodeExtractor(reader.getSourcePath()).getMethodDescription(reader.getMethod(), reader.getArgs());
        Assert.assertThat("The method should add a negative number and a positive number",
                methodDescription, RegexMatcher.matches("^.*?(((UnaryExpr\\[negative\\] )(IntegerLiteralExpr|DoubleLiteralExpr)\\[[0-9.d]+?\\] plus (UnaryExpr\\[positive\\] )?(IntegerLiteralExpr|DoubleLiteralExpr)\\[[0-9.d]+?\\])|((UnaryExpr\\[positive\\] )?(IntegerLiteralExpr|DoubleLiteralExpr)\\[[0-9.d]+?\\] plus (UnaryExpr\\[negative\\] )(IntegerLiteralExpr|DoubleLiteralExpr)\\[[0-9.d]+?\\])).*?$"));
    }

    @Test
    @Testifier(method = "addIntegerAndDouble", args = {})
    public void addIntegerAndDoubleCodeStructureTest() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        ArithmeticOperators.addIntegerAndDouble();

        /* assert */
        // read this test's annotations
        TestifierAnnotationReader reader = new TestifierAnnotationReader(
                this.getClass().getAnnotation(Testifier.class),
                this.getClass().getMethod("addIntegerAndDoubleCodeStructureTest").getAnnotation(Testifier.class)
        );

        // check the structure of the code
        String methodDescription = new SourceCodeExtractor(reader.getSourcePath()).getMethodDescription(reader.getMethod(), reader.getArgs());
        Assert.assertThat("The method should add an integer and a double together",
                methodDescription, RegexMatcher.matches("^.*?(((UnaryExpr\\[.*?\\] )?(IntegerLiteralExpr)\\[[0-9.d]+?\\] plus (UnaryExpr\\[.*?\\] )?(DoubleLiteralExpr)\\[[0-9.d]+?\\])|((UnaryExpr\\[.*?\\] )?(DoubleLiteralExpr)\\[[0-9.d]+?\\] plus (UnaryExpr\\[.*?\\] )?(IntegerLiteralExpr)\\[[0-9.d]+?\\])).*?$"));
    }

    @Test
    @Testifier(method = "subtractTwoNumbers", args = {})
    public void subtractTwoNumbersCodeStructureTest() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        ArithmeticOperators.subtractTwoNumbers();

        /* assert */
        // read this test's annotations
        TestifierAnnotationReader reader = new TestifierAnnotationReader(
                this.getClass().getAnnotation(Testifier.class),
                this.getClass().getMethod("subtractTwoNumbersCodeStructureTest").getAnnotation(Testifier.class)
        );

        // check the structure of the code
        String methodDescription = new SourceCodeExtractor(reader.getSourcePath()).getMethodDescription(reader.getMethod(), reader.getArgs());
        Assert.assertThat("The method should subtract two numbers",
                methodDescription, RegexMatcher.matches("^.*?((UnaryExpr\\[.*?\\] )?(IntegerLiteralExpr|DoubleLiteralExpr)\\[[0-9.d]+?\\] minus (UnaryExpr\\[.*?\\] )?(IntegerLiteralExpr|DoubleLiteralExpr)\\[[0-9.d]+?\\]).*?$"));
    }

    @Test
    @Testifier(method = "subtractThreeNumbers", args = {})
    public void subtractThreeNumbersCodeStructureTest() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        ArithmeticOperators.subtractThreeNumbers();

        /* assert */
        // read this test's annotations
        TestifierAnnotationReader reader = new TestifierAnnotationReader(
                this.getClass().getAnnotation(Testifier.class),
                this.getClass().getMethod("subtractThreeNumbersCodeStructureTest").getAnnotation(Testifier.class)
        );

        // check the structure of the code
        String methodDescription = new SourceCodeExtractor(reader.getSourcePath()).getMethodDescription(reader.getMethod(), reader.getArgs());
        Assert.assertThat("The method should subtract three numbers",
                methodDescription, RegexMatcher.matches("^.*?(UnaryExpr\\[.*?\\] )?(IntegerLiteralExpr|DoubleLiteralExpr)\\[[0-9.d]+?\\] minus (UnaryExpr\\[.*?\\] )?(IntegerLiteralExpr|DoubleLiteralExpr)\\[[0-9.d]+?\\] minus (UnaryExpr\\[.*?\\] )?(IntegerLiteralExpr|DoubleLiteralExpr)\\[[0-9.d]+?\\].*?$"));
    }

    @Test
    @Testifier(method = "subtractANegativeAndPositiveNumber", args = {})
    public void subtractANegativeAndPositiveNumberCodeStructureTest() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        ArithmeticOperators.subtractANegativeAndPositiveNumber();

        /* assert */
        // read this test's annotations
        TestifierAnnotationReader reader = new TestifierAnnotationReader(
                this.getClass().getAnnotation(Testifier.class),
                this.getClass().getMethod("subtractANegativeAndPositiveNumberCodeStructureTest").getAnnotation(Testifier.class)
        );

        // check the structure of the code
        String methodDescription = new SourceCodeExtractor(reader.getSourcePath()).getMethodDescription(reader.getMethod(), reader.getArgs());
        Assert.assertThat("The method should subtract a negative number and a positive number",
                methodDescription, RegexMatcher.matches("^.*?(((UnaryExpr\\[negative\\] )(IntegerLiteralExpr|DoubleLiteralExpr)\\[[0-9.d]+?\\] minus (UnaryExpr\\[positive\\] )?(IntegerLiteralExpr|DoubleLiteralExpr)\\[[0-9.d]+?\\])|((UnaryExpr\\[positive\\] )?(IntegerLiteralExpr|DoubleLiteralExpr)\\[[0-9.d]+?\\] minus (UnaryExpr\\[negative\\] )(IntegerLiteralExpr|DoubleLiteralExpr)\\[[0-9.d]+?\\])).*?$"));
    }

    @Test
    @Testifier(method = "combineAdditionAndSubtractionWithThreeNumbers", args = {})
    public void combineAdditionAndSubtractionWithThreeNumbersCodeStructureTest() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        ArithmeticOperators.combineAdditionAndSubtractionWithThreeNumbers();

        /* assert */
        // read this test's annotations
        TestifierAnnotationReader reader = new TestifierAnnotationReader(
                this.getClass().getAnnotation(Testifier.class),
                this.getClass().getMethod("combineAdditionAndSubtractionWithThreeNumbersCodeStructureTest").getAnnotation(Testifier.class)
        );

        // check the structure of the code
        String methodDescription = new SourceCodeExtractor(reader.getSourcePath()).getMethodDescription(reader.getMethod(), reader.getArgs());
        Assert.assertThat("The method should add and subtract three numbers",
                methodDescription, RegexMatcher.matches("^.*?(((UnaryExpr\\[.*?\\] )?(IntegerLiteralExpr|DoubleLiteralExpr)\\[[0-9.d]+?\\] minus (UnaryExpr\\[.*?\\] )?(IntegerLiteralExpr|DoubleLiteralExpr)\\[[0-9.d]+?\\] plus (UnaryExpr\\[.*?\\] )?(IntegerLiteralExpr|DoubleLiteralExpr)\\[[0-9.d]+?\\])|((UnaryExpr\\[.*?\\] )?(IntegerLiteralExpr|DoubleLiteralExpr)\\[[0-9.d]+?\\] plus (UnaryExpr\\[.*?\\] )?(IntegerLiteralExpr|DoubleLiteralExpr)\\[[0-9.d]+?\\] minus (UnaryExpr\\[.*?\\] )?(IntegerLiteralExpr|DoubleLiteralExpr)\\[[0-9.d]+?\\])).*?$"));
    }

    @Test
    @Testifier(method = "multiplyTwoNumbers", args = {})
    public void multiplyTwoNumbersCodeStructureTest() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        ArithmeticOperators.multiplyTwoNumbers();

        /* assert */
        // read this test's annotations
        TestifierAnnotationReader reader = new TestifierAnnotationReader(
                this.getClass().getAnnotation(Testifier.class),
                this.getClass().getMethod("multiplyTwoNumbersCodeStructureTest").getAnnotation(Testifier.class)
        );

        // check the structure of the code
        String methodDescription = new SourceCodeExtractor(reader.getSourcePath()).getMethodDescription(reader.getMethod(), reader.getArgs());
        Assert.assertThat("The method should multiply two numbers",
                methodDescription, RegexMatcher.matches("^.*?((UnaryExpr\\[.*?\\] )?(IntegerLiteralExpr|DoubleLiteralExpr)\\[[0-9.d]+?\\] times (UnaryExpr\\[.*?\\] )?(IntegerLiteralExpr|DoubleLiteralExpr)\\[[0-9.d]+?\\]).*?$"));
    }

    @Test
    @Testifier(method = "multiplyThreeNumbers", args = {})
    public void multiplyThreeNumbersCodeStructureTest() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        ArithmeticOperators.multiplyThreeNumbers();

        /* assert */
        // read this test's annotations
        TestifierAnnotationReader reader = new TestifierAnnotationReader(
                this.getClass().getAnnotation(Testifier.class),
                this.getClass().getMethod("multiplyThreeNumbersCodeStructureTest").getAnnotation(Testifier.class)
        );

        // check the structure of the code
        String methodDescription = new SourceCodeExtractor(reader.getSourcePath()).getMethodDescription(reader.getMethod(), reader.getArgs());
        Assert.assertThat("The method should multiply three numbers",
                methodDescription, RegexMatcher.matches("^.*?(UnaryExpr\\[.*?\\] )?(IntegerLiteralExpr|DoubleLiteralExpr)\\[[0-9.d]+?\\] times (UnaryExpr\\[.*?\\] )?(IntegerLiteralExpr|DoubleLiteralExpr)\\[[0-9.d]+?\\] times (UnaryExpr\\[.*?\\] )?(IntegerLiteralExpr|DoubleLiteralExpr)\\[[0-9.d]+?\\].*?$"));
    }

    @Test
    @Testifier(method = "divideTwoIntegers", args = {})
    public void divideTwoIntegersCodeStructureTest() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        ArithmeticOperators.divideTwoIntegers();

        /* assert */
        // read this test's annotations
        TestifierAnnotationReader reader = new TestifierAnnotationReader(
                this.getClass().getAnnotation(Testifier.class),
                this.getClass().getMethod("divideTwoIntegersCodeStructureTest").getAnnotation(Testifier.class)
        );

        // check the structure of the code
        String methodDescription = new SourceCodeExtractor(reader.getSourcePath()).getMethodDescription(reader.getMethod(), reader.getArgs());
        Assert.assertThat("The method should divide two integers",
                methodDescription, RegexMatcher.matches("^.*?(UnaryExpr\\[.*?\\] )?IntegerLiteralExpr\\[[0-9]+?\\] divide (UnaryExpr\\[.*?\\] )?IntegerLiteralExpr\\[[0-9]+?\\].*?$"));
    }

    @Test
    @Testifier(method = "divideThreeIntegers", args = {})
    public void divideThreeIntegersCodeStructureTest() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        ArithmeticOperators.divideThreeIntegers();

        /* assert */
        // read this test's annotations
        TestifierAnnotationReader reader = new TestifierAnnotationReader(
                this.getClass().getAnnotation(Testifier.class),
                this.getClass().getMethod("divideThreeIntegersCodeStructureTest").getAnnotation(Testifier.class)
        );

        // check the structure of the code
        String methodDescription = new SourceCodeExtractor(reader.getSourcePath()).getMethodDescription(reader.getMethod(), reader.getArgs());
        Assert.assertThat("The method should divide three integers",
                methodDescription, RegexMatcher.matches("^.*?(UnaryExpr\\[.*?\\] )?IntegerLiteralExpr\\[[0-9]+?\\] divide (UnaryExpr\\[.*?\\] )?IntegerLiteralExpr\\[[0-9]+?\\] divide (UnaryExpr\\[.*?\\] )?IntegerLiteralExpr\\[[0-9]+?\\].*?$"));
    }

    @Test
    @Testifier(method = "divideTwoDoubles", args = {})
    public void divideTwoDoublesCodeStructureTest() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        ArithmeticOperators.divideTwoDoubles();

        /* assert */
        // read this test's annotations
        TestifierAnnotationReader reader = new TestifierAnnotationReader(
                this.getClass().getAnnotation(Testifier.class),
                this.getClass().getMethod("divideTwoDoublesCodeStructureTest").getAnnotation(Testifier.class)
        );

        // check the structure of the code
        String methodDescription = new SourceCodeExtractor(reader.getSourcePath()).getMethodDescription(reader.getMethod(), reader.getArgs());
        Assert.assertThat("The method should divide two doubles",
                methodDescription, RegexMatcher.matches("^.*?(UnaryExpr\\[.*?\\] )?DoubleLiteralExpr\\[[0-9.d]+?\\] divide (UnaryExpr\\[.*?\\] )?DoubleLiteralExpr\\[[0-9.d]+?\\].*?$"));
    }

    @Test
    @Testifier(method = "divideThreeDoubles", args = {})
    public void divideThreeDoublesCodeStructureTest() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        ArithmeticOperators.divideThreeDoubles();

        /* assert */
        // read this test's annotations
        TestifierAnnotationReader reader = new TestifierAnnotationReader(
                this.getClass().getAnnotation(Testifier.class),
                this.getClass().getMethod("divideThreeDoublesCodeStructureTest").getAnnotation(Testifier.class)
        );

        // check the structure of the code
        String methodDescription = new SourceCodeExtractor(reader.getSourcePath()).getMethodDescription(reader.getMethod(), reader.getArgs());
        Assert.assertThat("The method should divide three doubles",
                methodDescription, RegexMatcher.matches("^.*?(UnaryExpr\\[.*?\\] )?DoubleLiteralExpr\\[[0-9.d]+?\\] divide (UnaryExpr\\[.*?\\] )?DoubleLiteralExpr\\[[0-9.d]+?\\] divide (UnaryExpr\\[.*?\\] )?DoubleLiteralExpr\\[[0-9.d]+?\\].*?$"));
    }

    @Test
    @Testifier(method = "divideIntegerByDouble", args = {})
    public void divideIntegerByDoubleCodeStructureTest() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        ArithmeticOperators.divideIntegerByDouble();

        /* assert */
        // read this test's annotations
        TestifierAnnotationReader reader = new TestifierAnnotationReader(
                this.getClass().getAnnotation(Testifier.class),
                this.getClass().getMethod("divideIntegerByDoubleCodeStructureTest").getAnnotation(Testifier.class)
        );

        // check the structure of the code
        String methodDescription = new SourceCodeExtractor(reader.getSourcePath()).getMethodDescription(reader.getMethod(), reader.getArgs());
        Assert.assertThat("The method should divide an integer by a double",
                methodDescription, RegexMatcher.matches("^.*?(UnaryExpr\\[.*?\\] )?IntegerLiteralExpr\\[[0-9]+?\\] divide (UnaryExpr\\[.*?\\] )?DoubleLiteralExpr\\[[0-9.d]+?\\].*?$"));
    }

    @Test
    @Testifier(method = "divideDoubleByInteger", args = {})
    public void divideDoubleByIntegerCodeStructureTest() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        ArithmeticOperators.divideDoubleByInteger();

        /* assert */
        // read this test's annotations
        TestifierAnnotationReader reader = new TestifierAnnotationReader(
                this.getClass().getAnnotation(Testifier.class),
                this.getClass().getMethod("divideDoubleByIntegerCodeStructureTest").getAnnotation(Testifier.class)
        );

        // check the structure of the code
        String methodDescription = new SourceCodeExtractor(reader.getSourcePath()).getMethodDescription(reader.getMethod(), reader.getArgs());
        Assert.assertThat("The method should divide a double by an integer",
                methodDescription, RegexMatcher.matches("^.*?(UnaryExpr\\[.*?\\] )?DoubleLiteralExpr\\[[0-9.d]+?\\] divide (UnaryExpr\\[.*?\\] )?IntegerLiteralExpr\\[[0-9]+?\\].*?$"));
    }

    @Test
    @Testifier(method = "remainderOfDividingTwoIntegers", args = {})
    public void remainderOfDividingTwoIntegersCodeStructureTest() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        ArithmeticOperators.remainderOfDividingTwoIntegers();

        /* assert */
        // read this test's annotations
        TestifierAnnotationReader reader = new TestifierAnnotationReader(
                this.getClass().getAnnotation(Testifier.class),
                this.getClass().getMethod("remainderOfDividingTwoIntegersCodeStructureTest").getAnnotation(Testifier.class)
        );

        // check the structure of the code
        String methodDescription = new SourceCodeExtractor(reader.getSourcePath()).getMethodDescription(reader.getMethod(), reader.getArgs());
        Assert.assertThat("The method should get the remainder left over when dividing two integers",
                methodDescription, RegexMatcher.matches("^.*?(UnaryExpr\\[.*?\\] )?IntegerLiteralExpr\\[[0-9]+?\\] remainder (UnaryExpr\\[.*?\\] )?IntegerLiteralExpr\\[[0-9]+?\\].*?$"));
    }

    @Test
    @Testifier(method = "combineAllFiveOperatorsWithParenthesisAndNegativeAndPositiveIntegersAndDoubles", args = {})
    public void combineAllFiveOperatorsWithParenthesisAndNegativeAndPositiveIntegersAndDoublesCodeStructureTest() throws NoSuchMethodException, IOException, ParseException {
        /* arrange */

        /* act */
        ArithmeticOperators.combineAllFiveOperatorsWithParenthesisAndNegativeAndPositiveIntegersAndDoubles();

        /* assert */
        // read this test's annotations
        TestifierAnnotationReader reader = new TestifierAnnotationReader(
                this.getClass().getAnnotation(Testifier.class),
                this.getClass().getMethod("combineAllFiveOperatorsWithParenthesisAndNegativeAndPositiveIntegersAndDoublesCodeStructureTest").getAnnotation(Testifier.class)
        );

        // check the structure of the code
        String methodDescription = new SourceCodeExtractor(reader.getSourcePath()).getMethodDescription(reader.getMethod(), reader.getArgs());
        Assert.assertThat("The method should use an expression that combines addition, subtraction, multiplication, division, and remainder operators. It must also use both positive and negative integers and doubles, as well as parenthesis.",
                methodDescription, RegexMatcher.matches("^(?=.*?UnaryExpr\\[negative\\].*?)(?=.*?UnaryExpr\\[negative\\].*?)(?=.*?DoubleLiteralExpr\\[[0-9.d]+?\\].*?)(?=.*?IntegerLiteralExpr\\[[0-9]+?\\].*?)(?=.*?plus.*?)(?=.*?minus.*?)(?=.*?divide.*?)(?=.*?times.*?)(?=.*?remainder.*?)(?=.*?EnclosedExpr.*?).*$"));
    }
}