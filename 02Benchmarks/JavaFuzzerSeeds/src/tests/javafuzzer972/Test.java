package tests.javafuzzer972;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 12:16:11 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-7L;
    public static int iFld=-181;
    public static byte byFld=-90;
    public float fFld=116.550F;
    public short sFld=3423;
    public long lArrFld[]=new long[N];
    public byte byArrFld[]=new byte[N];
    public volatile int iArrFld[]=new int[N];

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

    public static void vMeth() {


        Test.instanceCount *= 132;
        vMeth_check_sum += 0;
    }

    public static void vSmallMeth(int i2) {


        vMeth();
        vSmallMeth_check_sum += i2;
    }

    public void vMeth1(long l, int i8) {

        double d=-2.57268;

        Test.instanceCount = (-(iArrFld[(i8 >>> 1) % N] + (-(l <<= Test.iFld))));
        Test.iFld += (int)(Test.iFld - ((149L * (Test.iFld + Test.iFld)) + (26597 * d)));
        vMeth1_check_sum += l + i8 + Double.doubleToLongBits(d);
    }

    public static long lMeth(int i12, double d1, int i13) {

        int i15=-92, i16=72, i17=-217, i18=-15961, i19=-4, i20=12, iArr[]=new int[N];
        byte by1=-62;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, -14);
        FuzzerUtils.init(lArr, 660726394L);

        for (int i14 : iArr) {
            for (i15 = 1; i15 < 4; i15++) {
                i12 -= (int)((lArr[i15]--) + i13);
                i14 = (iArr[i15 + 1]++);
                i14 += (i15 ^ Test.instanceCount);
                i13 = (int)Test.instanceCount;
                for (i17 = i15; i17 < 2; i17++) {
                    by1 &= (byte)(Test.iFld--);
                    i16 += (int)(i17 - ((i16 + 0.458F) * (++Test.instanceCount)));
                    Test.instanceCount = (++i14);
                    Test.instanceCount = i16;
                    vSmallMeth(Test.iFld);
                }
                for (i19 = i15; i19 < 2; i19++) {
                    i12 <<= -122;
                    iArr[i19 + 1] -= (int)d1;
                }
            }
        }
        long meth_res = i12 + Double.doubleToLongBits(d1) + i13 + i15 + i16 + i17 + i18 + by1 + i19 + i20 +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public int iMeth() {

        double d2=-118.47225;
        int i21=95, i22=35864, i23=-49869, i24=7488, i25=57119;
        boolean b=false;

        Test.instanceCount -= ((-Test.iFld) - ((Test.iFld--) + (Test.iFld * -589)));
        Test.iFld *= (int)lMeth(Test.iFld, d2, Test.iFld);
        Test.iFld = Test.iFld;
        Test.iFld = Test.byFld;
        i21 = 1;
        while (++i21 < 156) {
            Test.iFld += (i21 | Test.instanceCount);
            for (i22 = 1; i22 < 10; i22++) {
                i23 += (i22 * i23);
                i23 += (((i22 * i23) + Test.iFld) - Test.instanceCount);
                iArrFld[i22] = -83;
                for (i24 = 1; i24 < 2; i24++) {
                    if (b) break;
                    fFld -= Test.instanceCount;
                    Test.instanceCount += i24;
                    iArrFld[i21 + 1] += 26205;
                }
            }
        }
        long meth_res = Double.doubleToLongBits(d2) + i21 + i22 + i23 + i24 + i25 + (b ? 1 : 0);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=90, i1=-33727, i3=-20, i4=137, i5=-7, i6=-245, i7=197, i9=24, i10=13, i11=-101;
        byte by=24;
        float f1=1.562F, fArr[][]=new float[N][N];

        FuzzerUtils.init(fArr, -116.944F);

        for (i = 1; i < 138; i++) {
            for (int smallinvoc=0; smallinvoc<62; smallinvoc++) vSmallMeth(-i1);
            lArrFld[i - 1] = i;
            for (i3 = 2; 183 > i3; ++i3) {
                float f=2.211F;
                vMeth();
                i1 -= (i1 -= i3);
                f -= (i1++);
            }
            for (int smallinvoc=0; smallinvoc<62; smallinvoc++) vSmallMeth(Math.max((int)((Test.instanceCount + by) -
                (i1 + Test.instanceCount)), (int)((Test.iFld--) + (Test.instanceCount++))));
        }
        i5 = 1;
        while (++i5 < 257) {
            for (i6 = 6; i6 < 98; i6++) {
                i7 <<= (int)(-19L << ((-89 - (byArrFld[i5 - 1] += (byte)i7)) + Test.iFld));
                i1 += (i6 * i6);
            }
            vMeth1(lArrFld[i5], Short.reverseBytes((short)(f1 * -201L)) * (Test.iFld++));
            Test.instanceCount = ((lArrFld[i5 + 1]--) + iArrFld[i5 - 1]);
            i9 = 1;
            do {
                Test.instanceCount = (++Test.iFld);
                i7 += (-2 * ((i7 + i5) + i));
                i7 &= (int)(((i6 * -58) * (++fArr[i5 + 1][i9])) * i6);
                lArrFld[i9] <<= Test.instanceCount;
                for (i10 = i9; i10 < 1; i10++) {
                    switch ((i10 % 4) + 21) {
                    case 21:
                        i4 = (int)(((Test.instanceCount + i10) - iMeth()) - i6);
                        i11 += i10;
                        Test.instanceCount *= i3;
                        break;
                    case 22:
                        Test.instanceCount -= Test.instanceCount;
                        Test.instanceCount += (i10 ^ sFld);
                        Test.instanceCount += (long)(-48.1009F + (i10 * i10));
                        i11 += sFld;
                        break;
                    case 23:
                        i7 += (i10 * i10);
                        iArrFld[i5] = 176;
                    case 24:
                        i4 += (i10 * i10);
                        break;
                    default:
                        iArrFld[i9 + 1] += -4;
                    }
                }
            } while (++i9 < 98);
        }


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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test lMeth iMeth
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test lMeth iMeth
//DEBUG  vMeth1 ->  vMeth1 mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  lMeth ->  lMeth iMeth mainTest
//DEBUG  Depth = 4
//DEBUG  Classes = 1
//DEBUG  static objects = {}