# `:dict`, `:int` and `-> int` below are type hints in Python
def get_damage(weapon: dict, level: int) -> int:
    return weapon["damage"] + (level * 2)
