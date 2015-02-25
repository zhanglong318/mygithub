package com.wusong.hanukkah.data.service.impl;

import com.wusong.hanukkah.data.domain.FullJudgement;
import com.wusong.hanukkah.data.domain.Judgement;
import com.wusong.hanukkah.data.domain.Label;
import com.wusong.hanukkah.data.domain.LabelValue;
import com.wusong.hanukkah.data.domain.SearchResult;
import com.wusong.hanukkah.data.domain.TypeValueCondition;
import com.wusong.hanukkah.data.exception.DataException;
import com.wusong.hanukkah.data.service.DataService;
import org.apache.thrift.TException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataServiceImpl implements DataService.Iface {

    @Override
    public List<Label> getSearchBoxLabels(String searchWord) throws DataException, TException {

        LabelValue labelValue = new LabelValue();
        labelValue.setValue("张三石");
        labelValue.setExtraValue("北京市朝阳区人民法院");

        LabelValue labelValue2 = new LabelValue();
        labelValue2.setValue("田古");
        labelValue2.setExtraValue("北京市通州区人民法院");

        LabelValue labelValue3 = new LabelValue();
        labelValue3.setValue("李皓");
        labelValue3.setExtraValue("北京市海淀区人民法院");

        List<LabelValue> list = new ArrayList<>();
        list.add(labelValue);
        list.add(labelValue2);
        list.add(labelValue3);

        Label label = new Label();
        label.setType("judge");
        label.setName("法官");
        label.setLabelValues(list);

        return Arrays.asList(label);
    }

    @Override
    public SearchResult search4Judgements(List<TypeValueCondition> typeValueConditions, int startIndex, int countPerPage, int sortType) throws DataException, TException {
        return null;
    }

    @Override
    public FullJudgement getFullJudgement(String id) throws DataException, TException {
        return null;
    }


    //    @Override
//    public List<Judgement> search4Judgements(List<TypeValueCondition> typeValueConditions) throws DataException, TException {
//
//        typeValueConditions.forEach(typeValueCondition -> System.out.println(typeValueCondition.getType() + ", " +
//                typeValueCondition.getValue()));
//
//        List<Judgement> list = new ArrayList<>();
//
//        Judgement judgement = new Judgement();
//        Judgement judgement2 = judgement;
//
//        judgement.setId("uuid1");
//        judgement.setTitle("青岛首尔大酒店有限公司与林峰与青岛恒源达建设工程有限公司的建设工程施工合同纠纷申请再审民事裁定书");
//        judgement.setCaseType("民事");
//        judgement.setTrialRound("3");
//        judgement.setJudgementType("裁定");
//        judgement.setCourtName("最高人民法院");
//        judgement.setCaseNumber("（2014）民申字第319号");
//        judgement.setJudgementDate("2014-09-09");
//        judgement.setKeywords(Arrays.asList("拖欠", "尾款", "不给钱", "打人", "虚假合同"));
//        judgement.setCourtOpinion("本院认为，青岛首尔大酒店有限公司的再审申请符合《中华人民共和国民事诉讼法》第二百条第二项、" +
//                "第六项规定的情形。依照《中华人民共和国民事诉讼法》第二百零四条第二款、第二百零六条之规定，裁定如下：" +
//                "一、指令山东省高级人民法院再审本案；二、再审期间，中止原判决的执行。");
//        judgement.setPublishDate("2014-12-24");
//        judgement.setPublishType("0");
//
//        list.add(judgement);
//        list.add(judgement2);
//
//        return list;
//    }

}
