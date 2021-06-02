
// Decision process: 
// enum allows us to create a restricted (unchanging) set of values aka constants
// in this case, we know our game will be in 3 states
// although enum is not the most memory efficient, it improves readibility

/*
  Three potential states:
  NEW,
  ACTIVE,
  COMPLETE
*/
public enum GameState {
    NEW,
    ACTIVE,
    COMPLETE
}
