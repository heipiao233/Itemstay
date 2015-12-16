package me.nighteyes604.ItemStay;

/**
 *  Result of an item registration query.
 */
public enum QResult
{
	SUCCESS,

	/**
	 * A display is already registered at the given block.
	 */
	LOCATION_TAKEN,

	/**
	 * Item deregistration has failed, item display was not found.
	 */
	NOT_FOUND;

}
