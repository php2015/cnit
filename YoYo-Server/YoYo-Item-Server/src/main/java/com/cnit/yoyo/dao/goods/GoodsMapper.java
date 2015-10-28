package com.cnit.yoyo.dao.goods;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.cnit.yoyo.model.goods.Goods;
import com.cnit.yoyo.model.goods.GoodsExample;
import com.cnit.yoyo.model.goods.GoodsForAppVo;
import com.cnit.yoyo.model.goods.GoodsWithBLOBs;
import com.cnit.yoyo.model.goods.dto.AccessoryCatalogDTO;
import com.cnit.yoyo.model.goods.dto.GoodsAccessoryDTO;
import com.cnit.yoyo.model.goods.dto.GoodsBrandDTO;
import com.cnit.yoyo.model.goods.dto.GoodsCarDTO;
import com.cnit.yoyo.model.goods.dto.GoodsInfoListDTO;
import com.cnit.yoyo.model.goods.dto.GoodsQryDTO;

public interface GoodsMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_goods
     * @mbggenerated  Thu Apr 09 15:45:40 CST 2015
     */
    int deleteByExample(GoodsExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_goods
     * @mbggenerated  Thu Apr 09 15:45:41 CST 2015
     */
    int deleteByPrimaryKey(Integer goodsId);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_goods
     * @mbggenerated  Thu Apr 09 15:45:41 CST 2015
     */
    int insert(GoodsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_goods
     * @mbggenerated  Thu Apr 09 15:45:41 CST 2015
     */
    int insertSelective(GoodsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_goods
     * @mbggenerated  Thu Apr 09 15:45:41 CST 2015
     */
    List<GoodsWithBLOBs> selectByExampleWithBLOBs(GoodsExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_goods
     * @mbggenerated  Thu Apr 09 15:45:41 CST 2015
     */
    List<Goods> selectByExample(GoodsExample example);
    
    
    List<GoodsInfoListDTO> selectGoodsByGoodsIds(@Param("goodsIds") String goodsIds);
    
    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_goods
     * @mbggenerated  Thu Apr 09 15:45:41 CST 2015
     */
    GoodsWithBLOBs selectByPrimaryKey(Integer goodsId);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_goods
     * @mbggenerated  Thu Apr 09 15:45:41 CST 2015
     */
    int updateByExampleSelective(@Param("record") GoodsWithBLOBs record, @Param("example") GoodsExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_goods
     * @mbggenerated  Thu Apr 09 15:45:41 CST 2015
     */
    int updateByExampleWithBLOBs(@Param("record") GoodsWithBLOBs record, @Param("example") GoodsExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_goods
     * @mbggenerated  Thu Apr 09 15:45:41 CST 2015
     */
    int updateByExample(@Param("record") Goods record, @Param("example") GoodsExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_goods
     * @mbggenerated  Thu Apr 09 15:45:41 CST 2015
     */
    int updateByPrimaryKeySelective(GoodsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_goods
     * @mbggenerated  Thu Apr 09 15:45:41 CST 2015
     */
    int updateByPrimaryKeyWithBLOBs(GoodsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_goods
     * @mbggenerated  Thu Apr 09 15:45:41 CST 2015
     */
    int updateByPrimaryKey(Goods record);

    List<GoodsInfoListDTO> selectGoodsByParam(GoodsQryDTO qryDTO);
    
    int findGoodsByBn(String bn);
    int findEditGoodsByBn(String bn,Integer goodsId);
    List<Goods> findGoods(GoodsQryDTO goods);
    //更新库存与销售价
    void updateStoreAndPrice(GoodsWithBLOBs record); 
    
    List<Goods> findWarnGoods(GoodsQryDTO goods);
    
    List<Goods> findAlertGoods();
    
    /**
     * @Title:  selectByProductId  
     * @Description:  TODO(根据productId查询商品对象)  
     * @author <a href="cmlai@chinacnit.com">赖彩妙</a> 
     * @date 2015-5-4 下午1:10:41  
     * @version 1.0.0 
     * @param @param productId
     * @param @return
     * @return Goods  返回类型 
     * @throws
     */
    GoodsWithBLOBs selectByProductId(Integer productId);
    
    /**
     * @Title:  selectByGoodsIdList  
     * @Description:  TODO(根据goodsId查询商品列表)  
     * @author <a href="cmlai@chinacnit.com">赖彩妙</a> 
     * @date 2015-5-4 下午1:10:41  
     * @version 1.0.0 
     * @param @param goodsIdList
     * @param @return
     * @return Goods  返回类型 
     * @throws
     */
    List<GoodsWithBLOBs> selectByGoodsIds(List<Integer> integers);
    
    
    /**
     * @Title:  selectByGoodsIdList  
     * @Description:  TODO(根据goodsId查询商品列表)  
     * @author <a href="cmlai@chinacnit.com">赖彩妙</a> 
     * @date 2015-5-4 下午1:10:41  
     * @version 1.0.0 
     * @param @param goodsIdList
     * @param @return
     * @return Goods  返回类型 
     * @throws
     */
    List<GoodsWithBLOBs> selectByGoodsIdList(Integer [] integers);
    /**
     * @Title:  selectByParams  
     * @Description:  TODO(根据example和标签列表查询商品列表)  
     * @author <a href="cmlai@chinacnit.com">赖彩妙</a> 
     * @date 2015-5-9 下午3:12:07  
     * @version 1.0.0 
     * @param @param example
     * @param @param tagList
     * @param @return
     * @return List<GoodsWithBLOBs>  返回类型 
     * @throws
     */
	List<GoodsWithBLOBs> selectByParams(@Param("catIdList") List<Integer> catIdList,
			@Param("brandIdList") List<Integer> brandIdList, @Param("goodsIdList") List<Integer> goodsIdList,
			@Param("tagList") List<String> tagList, @Param("priceFrom") BigDecimal priceFrom, 
			@Param("priceTo") BigDecimal priceTo, @Param("escapeGoodsId") Integer escapeGoodsId);
	
	/**
	 * @Title:  increaseViewCount  
	 * @Description:  TODO(增加商品浏览次数)  
	 * @author <a href="cmlai@chinacnit.com">赖彩妙</a> 
	 * @date 2015-5-13 上午10:26:10  
	 * @version 1.0.0 
	 * @param @param goodsId
	 * @param @return
	 * @return int  返回类型 
	 * @throws
	 */
	int increaseViewCount(Integer goodsId);
	
	/**
	  * @description <b>增加商品评论数</b>
	  * @author 王鹏
	  * @version 1.0.0
	  * @data 2015-6-26
	  * @param @param goodsId
	  * @param @return
	  * @return int
	*/
	int addCommentsCount(Long goodsId);

	List<GoodsInfoListDTO> selectByQueryParams(@Param("whereStmt")List<String> mqlString, @Param("orderStmt")String orderBy);
	
	/**
	 * @Title:  selectTopSalesByGoodsId  
	 * @Description:  TODO(根据店铺id查询本店热销商品)  
	 * @author <a href="cmlai@chinacnit.com">赖彩妙</a> 
	 * @date 2015-5-16 下午2:41:38  
	 * @version 1.0.0 
	 * @param @param goodsId
	 * @param @return
	 * @return List<GoodsWithBLOBs>  返回类型 
	 * @throws
	 */
	List<GoodsWithBLOBs> selectTopSalesByGoodsId(Map<String, Object> param);
	
	List<GoodsWithBLOBs> findGoodsByBrandId(@Param("brandId")Integer barandId);
	
	List<Integer> findGoodsByCarId(Integer[] id);
	
	
	/**
	  * @description <b>查商品配件信息</b>
	  * @author 王鹏
	  * @version 1.0.0
	  * @data 2015-5-26
	  * @param @param goodsId
	  * @param @return
	  * @return List<GoodsAccessoryDTO>
	*/
	List<GoodsAccessoryDTO> selectGoodsAccessoryInfo(Integer [] goodsId);
	
	List<AccessoryCatalogDTO> selectGoodsAccessoryCatalog(Integer [] goodsId);
	
	/**
	 * @Title:  selectByProductIdList  
	 * @Description:  TODO(根据货品id列表查询商品)  
	 * @author <a href="cmlai@chinacnit.com">赖彩妙</a> 
	 * @date 2015-6-1 下午1:07:51  
	 * @version 1.0.0 
	 * @param @param productIdList
	 * @param @return
	 * @return List<GoodsWithBLOBs>  返回类型 
	 * @throws
	 */
	List<GoodsWithBLOBs> selectByProductIdList(List<Integer> productIdList);
	
	/**
	 * @Title:  addFavCountByGoodsIdList  
	 * @Description:  TODO(根据商品id列表增加商品被关注次数)  
	 * @author <a href="cmlai@chinacnit.com">赖彩妙</a> 
	 * @date 2015-6-1 下午1:15:23  
	 * @version 1.0.0 
	 * @param @param goodsId
	 * @param @return
	 * @return int  返回类型 
	 * @throws
	 */
	int addFavCountByGoodsIdList(List<Integer> goodsIdList);
	
	/**
	  * @description <b>增加商品购买次数</b>
	  * @author 王鹏
	  * @version 1.0.0
	  * @data 2015-7-1
	  * @param @param ids
	  * @param @return
	  * @return int
	*/
	int addGoodsBuyCount(@Param("goodsId")Long goodsId,@Param("buyCount")Integer buyCount);
	
	List<Goods> findLocationGoods(GoodsQryDTO goods);
	
	int checkGoodsNum(Integer companyId);
	//检查分店是否限制发布商品
	int checkStoreLimitGoods(@Param("storeId")Integer storeId);
	List<Goods> findViolationGoods(GoodsQryDTO goods);
	
	
	/**
	 * @Title:  updateStore  
	 * @Description:  TODO(更新库存)  
	 * @author <a href="cmlai@chinacnit.com">赖彩妙</a> 
	 * @date 2015-6-23 上午11:41:26  
	 * @version 1.0.0 
	 * @param @param productId
	 * @param @param quantity
	 * @param @return
	 * @return int  返回类型 
	 * @throws
	 */
	int updateStore(Integer productId);
	
	int downGoodsByCompanyId(Integer[] ids);
	
	/**
	 * @Title:  selectGoodsBrandById  
	 * @Description:  TODO(根据商品id查询对象)  
	 * @author <a href="cmlai@chinacnit.com">赖彩妙</a> 
	 * @date 2015-6-29 下午9:11:22  
	 * @version 1.0.0 
	 * @param @param goodsId
	 * @param @return
	 * @return GoodsBrandDTO  返回类型 
	 * @throws
	 */
	GoodsWithBLOBs selectGoodsBrandById(Integer goodsId);
	
	/**
	 * @Title:  selectGoodsBrandByProductId  
	 * @Description:  TODO(根据货品id查询商品)  
	 * @author <a href="cmlai@chinacnit.com">赖彩妙</a> 
	 * @date 2015-6-29 下午9:18:55  
	 * @version 1.0.0 
	 * @param @param productId
	 * @param @return
	 * @return GoodsBrandDTO  返回类型 
	 * @throws
	 */
	GoodsWithBLOBs selectGoodsBrandByProductId(Integer productId);
	
	/**
	 * @Title:  selectByProductIds  
	 * @Description:  TODO(根据货品id列表查询商品)  
	 * @author <a href="cmlai@chinacnit.com">赖彩妙</a> 
	 * @date 2015-6-30 下午12:25:34  
	 * @version 1.0.0 
	 * @param @param productIdList
	 * @param @return
	 * @return List<GoodsWithBLOBs>  返回类型 
	 * @throws
	 */
	List<GoodsWithBLOBs> selectByProductIds(List<Integer> productIdList);
	
	Integer selectMinStore(List<Integer> goodsIds);
	
	List<GoodsCarDTO> selectGoodsCar(Long [] goodsIds);
	
	String getAllChildGoodsCat(@Param("pid")Integer pid);

	List<Goods> selectGoodsByCarDept(Map<String, Object> params);
	
	List<GoodsForAppVo> listGoods(Map params);

	List<Goods> findActivityGoods(GoodsQryDTO qryDTO);

	List<Goods> findAddActivityGoods(GoodsQryDTO qryDTO);

	void updateActivityGoods(Integer[] ids);

	void updateActivityGoodsById(Integer goodsId);

	List<GoodsInfoListDTO> selectGoodsForActivity(GoodsQryDTO qryDTO);
}