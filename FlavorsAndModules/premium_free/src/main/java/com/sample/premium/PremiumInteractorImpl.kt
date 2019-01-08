package com.sample.premium

import com.billing.BillingApi
import com.sample.premium_interfraces.PremiumInteractor


class PremiumInteractorImpl : PremiumInteractor {

    override fun isPremium(): Boolean = BillingApi.isPurchased

}
