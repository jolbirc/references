# MODULES CHEAT SHEET

---

- **Start from the crate root**: When compiling a crate, the compiler first looks in the crate root (usually *src/lib.s*)
- **Declaring modules**: `mod garden`; compiler will look for modules code in these places:
  - Inline, within the curly brackets that replace the semicolon following `mod garden`
  - In the file `src/garden.rs`
  - In the file `src/garden/mod.rs`
- **Declaring submodules**: In any other file than the crate root, you can declare submodules. E.g.:
  - `mod vegetables;` in `src/garden.rs`
  - Inline, directly following `mod vegetables;`
  - In the file `src/garden/vegetables.rs`
  - In the file `src/garden/vegetables/mod.rs`
- **Paths to code in modules**:
  - Can refer to code in that module from anywhere else in that same crate
  - E.g. an `Asparagus` type in the garden vegetables module will be found at `crate::garden::vegetables::Asparagus`
- **Private vs. Public**: 
  - To make a module public, declare with `pub mod` instead of `mod`
  - To make items within a piblic module public also, use `pub` before declaration
- **`use` Keyword**:
  - In any scope that can refer to `crate::garden::vegetables::Asparagus`:
    - Shortcut the above and then simply use `Asparagus` in scope.

## An example using binary crate `backyard`: 

`
backyard
├── Cargo.lock
├── Cargo.toml
└── src
    ├── garden
    │   └── vegetables.rs
    ├── garden.rs
    └── main.rs
`
- The crate root file in this case is `src/main.rs`:
```rust
use crate::garden::vegetables::Asparagus;

// Tells the compiler to include the code it finds in `src/garden.rs`
pub mod garden; 

fn main() {
    let plant = Asparagus {};
    println!("I'm growing {plant:?}!");
}
```
