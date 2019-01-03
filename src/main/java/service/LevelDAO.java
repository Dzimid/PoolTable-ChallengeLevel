package service;

import model.ChallengeLevelXML;

public interface LevelDAO {
    /**
     * Load {@link ChallengeLevelXML}
     *
     * @param levelName level name
     * @return {@link ChallengeLevelXML}
     */
    ChallengeLevelXML loadByName(String levelName);

    /**
     * Save {@link ChallengeLevelXML}
     *
     * @param challengeLevel {@link ChallengeLevelXML} object
     * @return true if save completed
     */
    boolean save(ChallengeLevelXML challengeLevel);
}
