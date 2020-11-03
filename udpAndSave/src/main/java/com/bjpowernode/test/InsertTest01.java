package com.bjpowernode.test;

import com.bjpowernode.dao.HumanDataDao;
import com.bjpowernode.domain.HumanData;
import com.bjpowernode.utils.MyBatisUtils;
import com.bjpowernode.utils.UdpTestUtil;
import com.bjpowernode.utils.UdpUtil;
import org.apache.ibatis.session.SqlSession;

public class InsertTest01
{
    public static void main(String[] args)
    {
        SqlSession session = MyBatisUtils.getSqlSession();
        //HumanDataDao dao = session.getMapper(HumanDataDao.class);
        // 这个地方就是插入的关键操作
        UdpTestUtil uu = new UdpTestUtil();
        while(true)
        {
            byte[] msg = uu.getMessageByte();
            //dao.insertHumanData(hd);
            // 测试成功！
            //session.commit();
            //session.close();
           // System.out.println(String.valueOf(msg[0]));
           // System.out.println(msg[0]/2);
            float[] f = new float[51];
            /*int i = 19;
            int j = 0;
            for(;i < 220 && j < 51; i=i+4,j++)
            {
                f[i]
            }*/

            //位移数据
            byte[] left = {0x00,0x00,msg[3],msg[4]};
            byte[] right = {0x00,0x00,msg[5],msg[6]};
            float dist_l = uu.byte2float(left,0);
            float dist_r = uu.byte2float(right,0);
            // 倾角数据
            float roll_l = ((msg[7] << 8)|msg[8])/32768*180;
            float pitch_l = ((msg[9] << 8)|msg[10])/32768*180;
            float yaw_l = ((msg[11] << 8)|msg[12])/32768*180;
            float roll_r = ((msg[13] << 8)|msg[14])/32768*180;
            float pitch_r = ((msg[15] << 8)|msg[16])/32768*180;
            float yaw_r = ((msg[17] << 8)|msg[18])/32768*180;
            // 姿态数据
            for(int i=19,j=0; i<220 && j<51;i+=4,j++)
            {
                f[j] = uu.byte2float(msg,i);
            }
            HumanData hd = new HumanData(null,null,dist_l,dist_r,roll_l,pitch_l,yaw_l,roll_r,pitch_r,yaw_r,
                    f[1],f[2],f[3],f[4],f[5],f[6],f[7],f[8],f[9],f[10],
                    f[11],f[12],f[13],f[14],f[15],f[16],f[17],f[18],f[19],f[20],
                    f[21],f[22],f[23],f[24],f[25],f[26],f[27],f[28],f[29],f[30],
                    f[31],f[32],f[33],f[34],f[35],f[36],f[37],f[38],f[39],f[40],
                    f[41],f[42],f[43],f[44],f[45],f[46],f[47],f[48],f[49],f[50],f[51]
            );

            //float f = uu.byte2float(msg,19);
            //System.out.println(f);

        }
        // String[] result = msg.split(" ");
        // 循环将String类型转为
        // 将建立HumanData数据结构体
        // 写一个convert将16进制转换为Float类型在转换为String类型

    }
}
