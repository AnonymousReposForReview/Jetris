package tests.javafuzzer468;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 04:13:14 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-36758L;
    public static float fFld=-96.204F;
    public static int iFld=-49659;
    public static boolean bFld=false;
    public byte byFld=33;
    public static short sFld=23973;

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i4=158, i5=117, i6=26214, i7=16652, i8=4;
        double d=1.50304;
        float fArr[]=new float[N];
        short sArr[]=new short[N];
        boolean bArr[][]=new boolean[N][N];

        FuzzerUtils.init(fArr, 6.550F);
        FuzzerUtils.init(sArr, (short)10867);
        FuzzerUtils.init(bArr, true);

        Test.instanceCount >>= 132L;
        fArr = fArr;
        for (i4 = 327; i4 > 15; --i4) {
            Test.iFld = i5;
            for (i6 = 5; i6 > i4; i6 -= 2) {
                Test.instanceCount = i7;
                for (d = 1; d < 1; ++d) {
                    sArr[i6 - 1] = (short)Test.instanceCount;
                    i7 &= -49352;
                    i7 >>= (int)Test.instanceCount;
                    if (Test.bFld) break;
                    Test.iFld += 95;
                    i5 += (int)d;
                    bArr[i4][i6] = Test.bFld;
                    i5 -= 26899;
                }
            }
        }
        vMeth1_check_sum += i4 + i5 + i6 + i7 + Double.doubleToLongBits(d) + i8 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(sArr) +
            FuzzerUtils.checkSum(bArr);
    }

    public static int iMeth(int i2, int i3) {

        double d1=-1.101688;
        int i9=13, i10=1, i11=2, i12=218, i13=-38832, iArr1[]=new int[N];
        byte by=-103;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr1, 10);
        FuzzerUtils.init(lArr, 81L);

        i2 = (int)(++Test.instanceCount);
        Test.iFld += (int)(((Test.iFld - 217) + (--i3)) + Test.fFld);
        vMeth1();
        if (Test.bFld) {
            for (d1 = 11; d1 < 357; ++d1) {
                iArr1[(int)(d1)] -= (int)d1;
                by -= (byte)Test.fFld;
            }
        } else if (Test.bFld) {
            i10 = 1;
            do {
                for (i11 = 1; i11 < 5; ++i11) {
                    i12 = (int)Test.instanceCount;
                    Test.iFld += (((i11 * Test.fFld) + i11) - Test.iFld);
                    by >>>= (byte)i11;
                    i2 += (int)Test.instanceCount;
                    Test.instanceCount = (long)Test.fFld;
                }
                i2 -= Test.iFld;
            } while (++i10 < 358);
        } else if (Test.bFld) {
            lArr[(i11 >>> 1) % N] *= i12;
        } else {
            i12 = i13;
        }
        long meth_res = i2 + i3 + Double.doubleToLongBits(d1) + i9 + by + i10 + i11 + i12 + i13 +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i=3, i1=52245, i14=-12, i15=12, i16=94, i17=0, iArr[][]=new int[N][N];
        double d2=-55.63777, dArr[]=new double[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr, 0);
        FuzzerUtils.init(lArr1, -4L);
        FuzzerUtils.init(dArr, -1.109761);

        for (i = 7; i < 177; i++) {
            i1 ^= (int)(((-iArr[i + 1][i]) * (-35541L >> Math.max(-29334L, Test.instanceCount))) - (-(++Test.fFld)));
            i1 *= Math.min(i1++, Test.iFld--);
        }
        Test.iFld = iMeth(Test.iFld, Test.iFld);
        lArr1[(i1 >>> 1) % N] = -3;
        Test.iFld = (int)Test.instanceCount;
        Test.iFld = Test.iFld;
        Test.iFld += (int)Test.instanceCount;
        d2 = i1;
        for (i14 = 10; i14 < 221; ++i14) {
            i1 += (((i14 * Test.iFld) + i) - Test.iFld);
            for (i16 = i14; i16 < 8; ++i16) {
                i1 += (i16 - i15);
            }
            Test.iFld = i17;
            dArr[i14] -= i;
        }
        vMeth_check_sum += i + i1 + Double.doubleToLongBits(d2) + i14 + i15 + i16 + i17 + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(lArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        double d3=-2.1520;
        int i19=11, i20=-1, i21=63596, i22=-1, iArr2[]=new int[N];
        float fArr1[]=new float[N];

        FuzzerUtils.init(fArr1, 1.748F);
        FuzzerUtils.init(iArr2, 38502);

        vMeth();
        for (float f : fArr1) {
            d3 = Test.iFld;
        }
        for (int i18 : iArr2) {
            Test.iFld *= (int)155L;
            fArr1[(Test.iFld >>> 1) % N] -= -12;
            for (i19 = 63; i19 > 2; --i19) {
                for (i21 = 2; i21 > i19; --i21) {
                    long l=-6472847847684683928L;
                    switch (((i19 >>> 1) % 5) + 99) {
                    case 99:
                        byFld = (byte)Test.instanceCount;
                        break;
                    case 100:
                        i18 = i21;
                        i22 += (i21 * i21);
                    case 101:
                        i20 = 12;
                        break;
                    case 102:
                        fArr1[i19] -= (float)d3;
                        i18 += i21;
                        break;
                    case 103:
                        d3 *= l;
                        break;
                    }
                    Test.instanceCount >>= l;
                }
                iArr2[i19] += (int)Test.fFld;
                Test.bFld = Test.bFld;
                iArr2[i19 + 1] += (int)Test.instanceCount;
            }
            Test.fFld = Test.fFld;
            Test.instanceCount -= i22;
            Test.instanceCount = i20;
        }
        Test.instanceCount = (long)Test.fFld;
        i20 = -63890;
        Test.fFld += Test.iFld;
        i20 >>>= i20;
        iArr2[(i19 >>> 1) % N] <<= Test.iFld;
        Test.instanceCount -= Test.sFld;
        Test.fFld *= Test.iFld;



    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}