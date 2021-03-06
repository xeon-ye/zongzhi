package com.weique.overhaul.v2.di.module;

import com.weique.overhaul.v2.mvp.contract.CommentDetailContract;
import com.weique.overhaul.v2.mvp.model.CommentDetailModel;

import dagger.Binds;
import dagger.Module;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 10/31/2019 11:43
 *

 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@Module
public abstract class CommentDetailModule {

    @Binds
    abstract CommentDetailContract.Model bindCommentDetailModel(CommentDetailModel model);
}