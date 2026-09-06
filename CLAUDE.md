# CLAUDE.md — OOPS

## Build / test / lint
- None found: no root manifest (package.json/go.mod/pyproject.toml/Cargo.toml) exists in this repo
- `BASIC/**` files compile/run individually, e.g. `javac InheritanceExample.java && java InheritanceExample` (README.md:81-85)
- `Java OOPS and Some Probelms/Inharitance/pom.xml` and `.../Class_And_Objects/pom.xml` are plain Maven POMs (no `<build>`/plugins section) — standard `mvn compile`/`mvn package` apply, no custom goals declared

## Rules
- `Inharitance` module targets `maven.compiler.source/target` 22; `Class_And_Objects` module targets 25 (from each module's own `pom.xml`) — do not assume a shared Java version across modules
- No parent POM — each Maven module under `Java OOPS and Some Probelms/` is independent

## Read first
1. `README.md`
2. `BASIC/OOP/BluePrint.java`
3. `Java OOPS and Some Probelms/Class_And_Objects/src/main/java/org/example/Main.java`

Architecture: see ARCHITECTURE.md — read before structural changes
