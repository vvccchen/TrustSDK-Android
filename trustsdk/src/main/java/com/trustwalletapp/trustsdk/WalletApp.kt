// Copyright © 2018 Trust.
//
// This file is part of TrustSDK. The full TrustSDK copyright notice, including
// terms governing use, modification, and redistribution, is contained in the
// file LICENSE at the root of the source code distribution tree.
package com.trustwalletapp.trustsdk

import android.net.Uri


/**
 * A wallet app supporting the trust deeplink spec
 */
data class WalletApp(val name: String, val scheme: String, val installUri: Uri)