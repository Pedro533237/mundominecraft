# Pizza World Datapack (Minecraft 1.21.x)

This datapack adds a **custom world preset** named `pizza:pizza_world` that arranges biomes in a stylized radial pattern inspired by a pizza map.

## What it does

- Forces world spawn to the exact center:
  - `setworldspawn 0 100 0`
  - `spawnRadius 0`
- Adds a custom world preset with a heavily curated **multi-noise biome table** that includes:
  - Center: Mushroom Fields
  - Cold northern cluster (incl. Pale Garden + snowy/peak biomes)
  - Forest / taiga / plains / desert-badlands / jungle / mountain clusters
  - Beach and river transitions
  - Ocean families (warm, normal, cold, frozen, deep variants)

## Installation

1. Zip the datapack root (this folder) or place it directly in a world `datapacks/` directory.
2. In world creation, select the world preset: `pizza:pizza_world`.
3. Create the world and start survival.

## Notes on determinism

- The biome *layout style* is fixed by explicit climate parameter ranges.
- Minecraft's noise seed still affects micro-variation, so for fully repeatable maps use a fixed world seed.
- The preset is survival-compatible and keeps vanilla Nether/End generation.

## Files

- `data/pizza/worldgen/world_preset/pizza_world.json` — custom dimension & biome source
- `data/pizza/functions/load.mcfunction` — enforced centered spawn
- `data/minecraft/tags/worldgen/world_preset/normal.json` — exposes preset in normal preset tag
