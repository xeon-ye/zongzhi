package com.weique.overhaul.v2.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

import com.weique.overhaul.v2.mvp.contract.PartyCenterContract;
import com.weique.overhaul.v2.mvp.model.PartyCenterModel;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 10/31/2019 09:45
 *

 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@Module
public abstract class PartyCenterModule {

    @Binds
    abstract PartyCenterContract.Model bindPartyCenterModel(PartyCenterModel model);
}