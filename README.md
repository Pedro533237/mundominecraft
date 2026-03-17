# Pizza World Mod (Fabric/Gradle)

Mod de geração customizada inspirado em “mapa pizza” para Minecraft, com preset próprio de mundo e spawn fixo no centro.

## O que foi feito (mod, não datapack solto)

- Projeto convertido para **mod Fabric empacotado em JAR** com build Gradle.
- Preset de mundo `pizza:pizza_world` embutido em `src/main/resources`.
- Tabela de biomas multi-noise com agrupamentos (frio, floresta, taiga, planícies, quente/seco, tropical, montanhas, oceanos).
- Praia normal e nevada + rios para transições.
- Nether e End mantidos vanilla (compatível com survival).
- Spawn forçado em `(0, 100, 0)` e `spawnRadius=0` via função de load.

## Build

```bash
gradle clean build
```

Jar gerado em:

```text
build/libs/pizza-world-mod-1.0.2.jar
```

## Uso

1. Copie o `.jar` para a pasta `mods` do seu Fabric Loader.
2. Crie um novo mundo e selecione o preset `pizza:pizza_world`.
3. Opcional: use seed fixa para repetibilidade de microvariações de ruído.

## Limitação importante

A definição de biomas via `multi_noise` melhora a direção dos clusters, mas o algoritmo vanilla ainda usa clima/ruído interno. Ou seja: o estilo radial fica consistente, porém não é uma malha “desenhada pixel a pixel” por coordenada.
