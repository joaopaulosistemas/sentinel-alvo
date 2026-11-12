package alvo.spel;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.expression.spel.standard.SpelExpressionParser;

class SpelVulneravel {
    Object avaliar(HttpServletRequest req) {
        String formula = req.getParameter("formula");
        // alvo: sentinel-spel-injection
        return new SpelExpressionParser().parseExpression(formula).getValue();
    }
}
