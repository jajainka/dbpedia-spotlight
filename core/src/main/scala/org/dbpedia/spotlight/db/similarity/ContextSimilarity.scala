package org.dbpedia.spotlight.db.similarity

import org.dbpedia.spotlight.model.{DBpediaResource, Candidate, Token}


/**
 * @author Joachim Daiber
 *
 *
 *
 */

trait ContextSimilarity {

  def score(query: java.util.Map[Token, Int], contextCounts: Map[DBpediaResource, java.util.Map[Token, Int]]): Map[DBpediaResource, Double]

}
