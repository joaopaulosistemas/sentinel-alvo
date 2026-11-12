// correto: sentinel-script-engine-eval-dinamico
package alvo.scriptengine;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

class ScriptEngineCorreto {
    Object calcular() throws Exception {
        ScriptEngine motor = new ScriptEngineManager().getEngineByName("javascript");
        return motor.eval("2 + 2");
    }
}
