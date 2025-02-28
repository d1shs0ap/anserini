/*
 * Anserini: A Lucene toolkit for reproducible information retrieval research
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.anserini.search.topicreader;

/**
 * An enumeration comprising standard sets of topics from various evaluations.
 */
public enum Topics {
  TREC1_ADHOC(TrecTopicReader.class, "topics-and-qrels/topics.adhoc.51-100.txt"),
  TREC2_ADHOC(TrecTopicReader.class, "topics-and-qrels/topics.adhoc.101-150.txt"),
  TREC3_ADHOC(TrecTopicReader.class, "topics-and-qrels/topics.adhoc.151-200.txt"),
  ROBUST04(TrecTopicReader.class, "topics-and-qrels/topics.robust04.txt"),
  ROBUST05(TrecTopicReader.class, "topics-and-qrels/topics.robust05.txt"),
  CORE17(TrecTopicReader.class, "topics-and-qrels/topics.core17.txt"),
  CORE18(TrecTopicReader.class, "topics-and-qrels/topics.core18.txt"),
  WT10G(TrecTopicReader.class, "topics-and-qrels/topics.adhoc.451-550.txt"),
  TREC2004_TERABYTE(TrecTopicReader.class, "topics-and-qrels/topics.terabyte04.701-750.txt"),
  TREC2005_TERABYTE(TrecTopicReader.class, "topics-and-qrels/topics.terabyte05.751-800.txt"),
  TREC2006_TERABYTE(TrecTopicReader.class, "topics-and-qrels/topics.terabyte06.801-850.txt"),
  TREC2007_MILLION_QUERY(WebTopicReader.class, "topics-and-qrels/topics.mq.1-10000.txt"),
  TREC2008_MILLION_QUERY(WebTopicReader.class, "topics-and-qrels/topics.mq.10001-20000.txt"),
  TREC2009_MILLION_QUERY(PrioritizedWebTopicReader.class, "topics-and-qrels/topics.mq.20001-60000.txt"),
  TREC2010_WEB(WebxmlTopicReader.class, "topics-and-qrels/topics.web.51-100.txt"),
  TREC2011_WEB(WebxmlTopicReader.class, "topics-and-qrels/topics.web.101-150.txt"),
  TREC2012_WEB(WebxmlTopicReader.class, "topics-and-qrels/topics.web.151-200.txt"),
  TREC2013_WEB(WebxmlTopicReader.class, "topics-and-qrels/topics.web.201-250.txt"),
  TREC2014_WEB(WebxmlTopicReader.class, "topics-and-qrels/topics.web.251-300.txt"),
  MB11(MicroblogTopicReader.class, "topics-and-qrels/topics.microblog2011.txt"),
  MB12(MicroblogTopicReader.class, "topics-and-qrels/topics.microblog2012.txt"),
  MB13(MicroblogTopicReader.class, "topics-and-qrels/topics.microblog2013.txt"),
  MB14(MicroblogTopicReader.class, "topics-and-qrels/topics.microblog2014.txt"),
  CAR17V15_BENCHMARK_Y1_TEST(CarTopicReader.class, "topics-and-qrels/topics.car17v1.5.benchmarkY1test.txt"),
  CAR17V20_BENCHMARK_Y1_TEST(CarTopicReader.class, "topics-and-qrels/topics.car17v2.0.benchmarkY1test.txt"),
  TREC2019_DL_DOC(TsvIntTopicReader.class,"topics-and-qrels/topics.dl19-doc.txt"),
  TREC2019_DL_DOC_UNICOIL(TsvIntTopicReader.class,"topics-and-qrels/topics.dl19-doc.unicoil.0shot.tsv.gz"),
  TREC2019_DL_DOC_UNICOIL_NOEXP(TsvIntTopicReader.class,"topics-and-qrels/topics.dl19-doc.unicoil-noexp.0shot.tsv.gz"),
  TREC2019_DL_PASSAGE(TsvIntTopicReader.class,"topics-and-qrels/topics.dl19-passage.txt"),
  TREC2019_DL_PASSAGE_UNICOIL(TsvIntTopicReader.class,"topics-and-qrels/topics.dl19-passage.unicoil.0shot.tsv.gz"),
  TREC2019_DL_PASSAGE_UNICOIL_NOEXP(TsvIntTopicReader.class,"topics-and-qrels/topics.dl19-passage.unicoil-noexp.0shot.tsv.gz"),
  TREC2020_DL(TsvIntTopicReader.class,"topics-and-qrels/topics.dl20.txt"),
  TREC2020_DL_UNICOIL(TsvIntTopicReader.class,"topics-and-qrels/topics.dl20.unicoil.0shot.tsv.gz"),
  TREC2020_DL_UNICOIL_NOEXP(TsvIntTopicReader.class,"topics-and-qrels/topics.dl20.unicoil-noexp.0shot.tsv.gz"),
  TREC2021_DL(TsvIntTopicReader.class,"topics-and-qrels/topics.dl21.txt"),
  TREC2021_DL_UNICOIL(TsvIntTopicReader.class,"topics-and-qrels/topics.dl21.unicoil.0shot.tsv.gz"),
  TREC2021_DL_UNICOIL_NOEXP(TsvIntTopicReader.class,"topics-and-qrels/topics.dl21.unicoil-noexp.0shot.tsv.gz"),
  MSMARCO_DOC_DEV(TsvIntTopicReader.class,"topics-and-qrels/topics.msmarco-doc.dev.txt"),
  MSMARCO_DOC_DEV_UNICOIL(TsvIntTopicReader.class,"topics-and-qrels/topics.msmarco-doc.dev.unicoil.tsv.gz"),
  MSMARCO_DOC_DEV_UNICOIL_NOEXP(TsvIntTopicReader.class,"topics-and-qrels/topics.msmarco-doc.dev.unicoil-noexp.tsv.gz"),
  MSMARCO_DOC_TEST(TsvIntTopicReader.class,"topics-and-qrels/topics.msmarco-doc.test.txt"),
  MSMARCO_PASSAGE_DEV_SUBSET(TsvIntTopicReader.class, "topics-and-qrels/topics.msmarco-passage.dev-subset.txt"),
  MSMARCO_PASSAGE_DEV_SUBSET_DEEPIMPACT(TsvIntTopicReader.class, "topics-and-qrels/topics.msmarco-passage.dev-subset.deepimpact.tsv.gz"),
  MSMARCO_PASSAGE_DEV_SUBSET_UNICOIL(TsvIntTopicReader.class, "topics-and-qrels/topics.msmarco-passage.dev-subset.unicoil.tsv.gz"),
  MSMARCO_PASSAGE_DEV_SUBSET_UNICOIL_NOEXP(TsvIntTopicReader.class, "topics-and-qrels/topics.msmarco-passage.dev-subset.unicoil-noexp.tsv.gz"),
  MSMARCO_PASSAGE_DEV_SUBSET_UNICOIL_TILDE(TsvIntTopicReader.class, "topics-and-qrels/topics.msmarco-passage.dev-subset.unicoil-tilde-expansion.tsv.gz"),
  MSMARCO_PASSAGE_DEV_SUBSET_DISTILL_SPLADE_MAX(TsvIntTopicReader.class, "topics-and-qrels/topics.msmarco-passage.dev-subset.distill-splade-max.tsv.gz"),
  MSMARCO_PASSAGE_TEST_SUBSET(TsvIntTopicReader.class, "topics-and-qrels/topics.msmarco-passage.test-subset.txt"),
  MSMARCO_V2_DOC_DEV(TsvIntTopicReader.class,"topics-and-qrels/topics.msmarco-v2-doc.dev.txt"),
  MSMARCO_V2_DOC_DEV_UNICOIL(TsvIntTopicReader.class,"topics-and-qrels/topics.msmarco-v2-doc.dev.unicoil.0shot.tsv.gz"),
  MSMARCO_V2_DOC_DEV_UNICOIL_NOEXP(TsvIntTopicReader.class,"topics-and-qrels/topics.msmarco-v2-doc.dev.unicoil-noexp.0shot.tsv.gz"),
  MSMARCO_V2_DOC_DEV2(TsvIntTopicReader.class,"topics-and-qrels/topics.msmarco-v2-doc.dev2.txt"),
  MSMARCO_V2_DOC_DEV2_UNICOIL(TsvIntTopicReader.class,"topics-and-qrels/topics.msmarco-v2-doc.dev2.unicoil.0shot.tsv.gz"),
  MSMARCO_V2_DOC_DEV2_UNICOIL_NOEXP(TsvIntTopicReader.class,"topics-and-qrels/topics.msmarco-v2-doc.dev2.unicoil-noexp.0shot.tsv.gz"),
  MSMARCO_V2_PASSAGE_DEV(TsvIntTopicReader.class, "topics-and-qrels/topics.msmarco-v2-passage.dev.txt"),
  MSMARCO_V2_PASSAGE_DEV_UNICOIL(TsvIntTopicReader.class, "topics-and-qrels/topics.msmarco-v2-passage.dev.unicoil.0shot.tsv.gz"),
  MSMARCO_V2_PASSAGE_DEV_UNICOIL_NOEXP(TsvIntTopicReader.class, "topics-and-qrels/topics.msmarco-v2-passage.dev.unicoil-noexp.0shot.tsv.gz"),
  MSMARCO_V2_PASSAGE_DEV2(TsvIntTopicReader.class, "topics-and-qrels/topics.msmarco-v2-passage.dev2.txt"),
  MSMARCO_V2_PASSAGE_DEV2_UNICOIL(TsvIntTopicReader.class, "topics-and-qrels/topics.msmarco-v2-passage.dev2.unicoil.0shot.tsv.gz"),
  MSMARCO_V2_PASSAGE_DEV2_UNICOIL_NOEXP(TsvIntTopicReader.class, "topics-and-qrels/topics.msmarco-v2-passage.dev2.unicoil-noexp.0shot.tsv.gz"),
  NTCIR8_ZH(TsvStringTopicReader.class, "topics-and-qrels/topics.ntcir8zh.eval.txt"),
  CLEF2006_FR(TsvStringTopicReader.class, "topics-and-qrels/topics.clef06fr.mono.fr.txt"),
  TREC2002_AR(TrecTopicReader.class, "topics-and-qrels/topics.trec02ar-ar.txt"),
  FIRE2012_BN(TrecTopicReader.class, "topics-and-qrels/topics.fire12bn.176-225.txt"),
  FIRE2012_HI(TrecTopicReader.class, "topics-and-qrels/topics.fire12hi.176-225.txt"),
  FIRE2012_EN(TrecTopicReader.class, "topics-and-qrels/topics.fire12en.176-225.txt"),
  COVID_ROUND1(CovidTopicReader.class, "topics-and-qrels/topics.covid-round1.xml"),
  COVID_ROUND1_UDEL(CovidTopicReader.class, "topics-and-qrels/topics.covid-round1-udel.xml"),
  COVID_ROUND2(CovidTopicReader.class, "topics-and-qrels/topics.covid-round2.xml"),
  COVID_ROUND2_UDEL(CovidTopicReader.class, "topics-and-qrels/topics.covid-round2-udel.xml"),
  COVID_ROUND3(CovidTopicReader.class, "topics-and-qrels/topics.covid-round3.xml"),
  COVID_ROUND3_UDEL(CovidTopicReader.class, "topics-and-qrels/topics.covid-round3-udel.xml"),
  COVID_ROUND4(CovidTopicReader.class, "topics-and-qrels/topics.covid-round4.xml"),
  COVID_ROUND4_UDEL(CovidTopicReader.class, "topics-and-qrels/topics.covid-round4-udel.xml"),
  COVID_ROUND5(CovidTopicReader.class, "topics-and-qrels/topics.covid-round5.xml"),
  COVID_ROUND5_UDEL(CovidTopicReader.class, "topics-and-qrels/topics.covid-round5-udel.xml"),
  TREC2018_BL(BackgroundLinkingTopicReader.class, "topics-and-qrels/topics.backgroundlinking18.txt"),
  TREC2019_BL(BackgroundLinkingTopicReader.class, "topics-and-qrels/topics.backgroundlinking19.txt"),
  TREC2020_BL(BackgroundLinkingTopicReader.class, "topics-and-qrels/topics.backgroundlinking20.txt"),
  EPIDEMIC_QA_EXPERT_PRELIM(EpidemicQATopicReader.class, "topics-and-qrels/topics.epidemic-qa.expert.prelim.json"),
  EPIDEMIC_QA_CONSUMER_PRELIM(EpidemicQATopicReader.class, "topics-and-qrels/topics.epidemic-qa.consumer.prelim.json"),
  DPR_NQ_DEV(DprNqTopicReader.class, "topics-and-qrels/topics.dpr.nq.dev.txt"),
  DPR_NQ_TEST(DprNqTopicReader.class, "topics-and-qrels/topics.dpr.nq.test.txt"),
  DPR_TRIVIA_DEV(DprNqTopicReader.class, "topics-and-qrels/topics.dpr.trivia.dev.txt"),
  DPR_TRIVIA_TEST(DprNqTopicReader.class, "topics-and-qrels/topics.dpr.trivia.test.txt"),
  DPR_WQ_TEST(DprJsonlTopicReader.class, "topics-and-qrels/topics.dpr.wq.test.txt"),
  DPR_CURATED_TEST(DprJsonlTopicReader.class, "topics-and-qrels/topics.dpr.curated.test.txt"),
  DPR_SQUAD_TEST(DprJsonlTopicReader.class, "topics-and-qrels/topics.dpr.squad.test.txt"),
  NQ_DEV(DprNqTopicReader.class, "topics-and-qrels/topics.nq.dev.txt"),
  NQ_TEST(DprNqTopicReader.class, "topics-and-qrels/topics.nq.test.txt"),
  MRTYDI_V11_AR_TRAIN(TsvIntTopicReader.class, "topics-and-qrels/topics.mrtydi-v1.1-ar.train.txt.gz"),
  MRTYDI_V11_AR_DEV(TsvIntTopicReader.class, "topics-and-qrels/topics.mrtydi-v1.1-ar.dev.txt.gz"),
  MRTYDI_V11_AR_TEST(TsvIntTopicReader.class, "topics-and-qrels/topics.mrtydi-v1.1-ar.test.txt.gz"),
  MRTYDI_V11_BN_TRAIN(TsvIntTopicReader.class, "topics-and-qrels/topics.mrtydi-v1.1-bn.train.txt.gz"),
  MRTYDI_V11_BN_DEV(TsvIntTopicReader.class, "topics-and-qrels/topics.mrtydi-v1.1-bn.dev.txt.gz"),
  MRTYDI_V11_BN_TEST(TsvIntTopicReader.class, "topics-and-qrels/topics.mrtydi-v1.1-bn.test.txt.gz"),
  MRTYDI_V11_EN_TRAIN(TsvIntTopicReader.class, "topics-and-qrels/topics.mrtydi-v1.1-en.train.txt.gz"),
  MRTYDI_V11_EN_DEV(TsvIntTopicReader.class, "topics-and-qrels/topics.mrtydi-v1.1-en.dev.txt.gz"),
  MRTYDI_V11_EN_TEST(TsvIntTopicReader.class, "topics-and-qrels/topics.mrtydi-v1.1-en.test.txt.gz"),
  MRTYDI_V11_FI_TRAIN(TsvIntTopicReader.class, "topics-and-qrels/topics.mrtydi-v1.1-fi.train.txt.gz"),
  MRTYDI_V11_FI_DEV(TsvIntTopicReader.class, "topics-and-qrels/topics.mrtydi-v1.1-fi.dev.txt.gz"),
  MRTYDI_V11_FI_TEST(TsvIntTopicReader.class, "topics-and-qrels/topics.mrtydi-v1.1-fi.test.txt.gz"),
  MRTYDI_V11_ID_TRAIN(TsvIntTopicReader.class, "topics-and-qrels/topics.mrtydi-v1.1-id.train.txt.gz"),
  MRTYDI_V11_ID_DEV(TsvIntTopicReader.class, "topics-and-qrels/topics.mrtydi-v1.1-id.dev.txt.gz"),
  MRTYDI_V11_ID_TEST(TsvIntTopicReader.class, "topics-and-qrels/topics.mrtydi-v1.1-id.test.txt.gz"),
  MRTYDI_V11_JA_TRAIN(TsvIntTopicReader.class, "topics-and-qrels/topics.mrtydi-v1.1-ja.train.txt.gz"),
  MRTYDI_V11_JA_DEV(TsvIntTopicReader.class, "topics-and-qrels/topics.mrtydi-v1.1-ja.dev.txt.gz"),
  MRTYDI_V11_JA_TEST(TsvIntTopicReader.class, "topics-and-qrels/topics.mrtydi-v1.1-ja.test.txt.gz"),
  MRTYDI_V11_KO_TRAIN(TsvIntTopicReader.class, "topics-and-qrels/topics.mrtydi-v1.1-ko.train.txt.gz"),
  MRTYDI_V11_KO_DEV(TsvIntTopicReader.class, "topics-and-qrels/topics.mrtydi-v1.1-ko.dev.txt.gz"),
  MRTYDI_V11_KO_TEST(TsvIntTopicReader.class, "topics-and-qrels/topics.mrtydi-v1.1-ko.test.txt.gz"),
  MRTYDI_V11_RU_TRAIN(TsvIntTopicReader.class, "topics-and-qrels/topics.mrtydi-v1.1-ru.train.txt.gz"),
  MRTYDI_V11_RU_DEV(TsvIntTopicReader.class, "topics-and-qrels/topics.mrtydi-v1.1-ru.dev.txt.gz"),
  MRTYDI_V11_RU_TEST(TsvIntTopicReader.class, "topics-and-qrels/topics.mrtydi-v1.1-ru.test.txt.gz"),
  MRTYDI_V11_SW_TRAIN(TsvIntTopicReader.class, "topics-and-qrels/topics.mrtydi-v1.1-sw.train.txt.gz"),
  MRTYDI_V11_SW_DEV(TsvIntTopicReader.class, "topics-and-qrels/topics.mrtydi-v1.1-sw.dev.txt.gz"),
  MRTYDI_V11_SW_TEST(TsvIntTopicReader.class, "topics-and-qrels/topics.mrtydi-v1.1-sw.test.txt.gz"),
  MRTYDI_V11_TE_TRAIN(TsvIntTopicReader.class, "topics-and-qrels/topics.mrtydi-v1.1-te.train.txt.gz"),
  MRTYDI_V11_TE_DEV(TsvIntTopicReader.class, "topics-and-qrels/topics.mrtydi-v1.1-te.dev.txt.gz"),
  MRTYDI_V11_TE_TEST(TsvIntTopicReader.class, "topics-and-qrels/topics.mrtydi-v1.1-te.test.txt.gz"),
  MRTYDI_V11_TH_TRAIN(TsvIntTopicReader.class, "topics-and-qrels/topics.mrtydi-v1.1-th.train.txt.gz"),
  MRTYDI_V11_TH_DEV(TsvIntTopicReader.class, "topics-and-qrels/topics.mrtydi-v1.1-th.dev.txt.gz"),
  MRTYDI_V11_TH_TEST(TsvIntTopicReader.class, "topics-and-qrels/topics.mrtydi-v1.1-th.test.txt.gz");

  public final String path;
  public final Class<? extends TopicReader> readerClass;

  Topics(Class<? extends TopicReader> c, String path) {
    this.readerClass = c;
    this.path = path;
  }
}
