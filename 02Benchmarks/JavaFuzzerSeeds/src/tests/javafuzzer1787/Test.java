package tests.javafuzzer1787;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 03:20:24 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3316063076169478528L;
    public static float fFld=2.186F;
    public static double dFld=1.99508;
    public int iFld=130;
    public static int iFld1=-173;
    public static float fArrFld[]=new float[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 0.104F);
        FuzzerUtils.init(Test.iArrFld, 218);
    }

    public static long vSmallMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(int i2) {

        int i3=11, i4=-142, i5=-172, i6=5, i7=225, i8=-79;
        boolean b=false;
        double d=-57.56558;
        short sArr[]=new short[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(sArr, (short)23227);
        FuzzerUtils.init(lArr, 154802662335262947L);

        i2 -= (int)Test.instanceCount;
        i2 += i2;
        for (i3 = 13; i3 < 208; ++i3) {
            i2 *= i4;
        }
        i5 = 1;
        do {
            i4 -= i3;
            i2 = (int)Test.instanceCount;
            i6 = 1;
            while (++i6 < 5) {
                switch ((((14 >>> 1) % 8) * 5) + 114) {
                case 127:
                    sArr = sArr;
                    for (i7 = 1; i7 < 1; i7++) {
                        Test.fArrFld[i5 + 1] -= Test.instanceCount;
                        Test.fArrFld[i6 - 1] -= i5;
                        if (b) continue;
                        Test.instanceCount >>>= 89;
                    }
                case 144:
                    lArr[i6] -= Test.instanceCount;
                    break;
                case 154:
                    i2 += (i6 * i6);
                    break;
                case 149:
                    Test.instanceCount += (((i6 * i2) + i7) - Test.instanceCount);
                case 135:
                    i2 = (int)d;
                    break;
                case 138:
                    Test.fFld = (float)d;
                case 124:
                    Test.iArrFld = Test.iArrFld;
                    break;
                case 147:
                    Test.instanceCount = 3L;
                    break;
                }
            }
        } while (++i5 < 328);
        long meth_res = i2 + i3 + i4 + i5 + i6 + i7 + i8 + (b ? 1 : 0) + Double.doubleToLongBits(d) +
            FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth() {

        int i1=-200, i9=-31896, i10=37776, i11=-45342, i12=-173;
        boolean b1=true;
        double d1=0.121369;

        i1 = (iMeth(i1) + i1);
        Test.dFld += i1;
        i1 = (int)Test.instanceCount;
        Test.iArrFld[(i1 >>> 1) % N] = i1;
        b1 = b1;
        i9 = 1;
        while (++i9 < 319) {
            for (d1 = i9; d1 < 5; d1++) {
                Test.instanceCount = i1;
                Test.fFld += (float)d1;
                Test.fFld = -983863992L;
                for (i11 = 1; i11 < 1; ++i11) {
                    Test.iArrFld = Test.iArrFld;
                }
                Test.dFld = i12;
                i1 <<= i10;
                Test.iArrFld[i9] = i12;
            }
        }
        long meth_res = i1 + (b1 ? 1 : 0) + i9 + Double.doubleToLongBits(d1) + i10 + i11 + i12;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static void vSmallMeth(int i) {


        lMeth();
        Test.iArrFld[(64621 >>> 1) % N] = (int)Test.instanceCount;
        vSmallMeth_check_sum += i;
    }

    public void mainTest(String[] strArr1) {

        int i13=-69, i14=48394, i15=34830, i16=-59719, i17=-57, i18=-42758, i19=-74, i20=124, i21=-14, i22=1;
        boolean b2=true;

        for (int smallinvoc=0; smallinvoc<576; smallinvoc++) vSmallMeth(iFld);
        Test.instanceCount += iFld;
        Test.instanceCount <<= -3690035425L;
        for (i13 = 8; i13 < 187; ++i13) {
            Test.instanceCount = -4;
            for (i15 = 7; i15 < 140; ++i15) {
                for (i17 = i13; i17 < 2; ++i17) {
                    Test.iArrFld[i17] = iFld;
                    i14 += (int)Test.fFld;
                    i14 += (i17 * i17);
                    Test.instanceCount = i15;
                    i18 <<= iFld;
                }
                Test.instanceCount = -8;
                Test.iArrFld[i13 + 1] += i13;
                for (i19 = 2; i19 > 1; i19 -= 2) {
                    if (b2) break;
                    i14 += (i19 | Test.iFld1);
                    Test.iFld1 += iFld;
                    Test.instanceCount += i19;
                    Test.iArrFld[(i13 >>> 1) % N] += -31622;
                    i14 <<= (int)-14L;
                    Test.iFld1 /= (int)1.535F;
                }
            }
            i21 = 1;
            do {
                iFld += i20;
                i22 = 1;
                while (++i22 < 1) {
                    Test.iFld1 >>= i14;
                    i14 *= i13;
                    Test.iFld1 = -4;
                }
            } while (++i21 < 140);
            Test.fFld -= iFld;
        }
        i20 -= 60;



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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test
//DEBUG  lMeth ->  lMeth vSmallMeth mainTest Test
//DEBUG  iMeth ->  iMeth lMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}