package alvo.scriptengine;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

class ScriptEngineVulneravel {
    Object calcular(String expressao) throws Exception {
        ScriptEngine motor = new ScriptEngineManager().getEngineByName("javascript");
        // alvo: sentinel-script-engine-eval-dinamico
        return motor.eval(expressao);
    }
}
