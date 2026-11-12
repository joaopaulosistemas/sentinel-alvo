"""Escreve um par de casos (vulnerável e correto) com a marca de comentário certa para cada extensão."""
import os
CM = {'html': '<!-- {} -->', 'xml': '<!-- {} -->', 'css': '/* {} */', 'scss': '/* {} */', 'sql': '-- {}',
      'properties': '# {}', 'yml': '# {}', 'yaml': '# {}', 'ts': '// {}', 'tsx': '// {}', 'java': '// {}',
      'vue': '<!-- {} -->', 'kt': '// {}', 'ejs': '<%# {} %>', 'jsp': '<%-- {} --%>'}


def emit(rid, d, name, ext, vul, ok):
    c = CM[ext]
    os.makedirs(d, exist_ok=True)
    v = vul.replace('@@', c.format('alvo: ' + rid))
    assert 'alvo:' in v, rid
    open(f"{d}/{name}.vulneravel.{ext}", 'w', encoding='utf-8').write(v if v.endswith('\n') else v + '\n')
    o = c.format('correto: ' + rid) + '\n' + ok
    open(f"{d}/{name}.correto.{ext}", 'w', encoding='utf-8').write(o if o.endswith('\n') else o + '\n')
