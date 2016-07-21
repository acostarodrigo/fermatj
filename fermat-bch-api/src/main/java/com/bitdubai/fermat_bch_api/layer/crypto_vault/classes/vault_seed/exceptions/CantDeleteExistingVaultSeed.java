package com.bitdubai.fermat_bch_api.layer.crypto_vault.classes.vault_seed.exceptions;

import com.bitdubai.fermat_api.FermatException;

/**
 * Created by rodrigo on 9/19/15.
 */
public class CantDeleteExistingVaultSeed extends FermatException {
    public final static String DEFAULT_MESSAGE = "There was an error trying to delete the Asset Vault Seed.";

    public CantDeleteExistingVaultSeed(String message, Exception cause, String context, String possibleReason) {
        super(message, cause, context, possibleReason);
    }
}
