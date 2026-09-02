package ch.bbw.classes.animals;

public interface SoundMaking {

	/**
	 * @return A typical sound emitted by this animal. Never {@code null}.
	 */
	String makeSound();

	/**
	 * @return true in case this animal is considered "loud".
	 */
	boolean isLoud();
}
