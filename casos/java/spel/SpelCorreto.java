// correto: sentinel-spel-injection
package alvo.spel;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.expression.spel.standard.SpelExpressionParser;

class SpelCorreto {
    Object avaliar(HttpServletRequest req) {
        String formula = "1 + 1";
        return new SpelExpressionParser().parseExpression(formula).getValue();
    }
}
