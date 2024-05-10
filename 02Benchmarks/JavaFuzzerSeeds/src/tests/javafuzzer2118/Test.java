package tests.javafuzzer2118;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 09:12:42 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=1441990068L;
    public static volatile int iFld=190;
    public static short sFld=-1893;
    public static boolean bFld=false;
    public static byte byFld=77;

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i6=-1, i7=-1, i8=114, i9=9, iArr1[]=new int[N];
        byte by=104;
        float f=121.895F;
        double d=59.75624;

        FuzzerUtils.init(iArr1, -5);

        iArr1[(Test.iFld >>> 1) % N] += Test.iFld;
        for (int i5 : iArr1) {
            for (i6 = 1; i6 < 4; i6++) {
                Test.sFld += (short)i6;
            }
            for (i8 = 4; i8 > 1; i8 -= 3) {
                switch ((((-2 >>> 1) % 4) * 5) + 86) {
                case 95:
                    Test.instanceCount /= (i8 | 1);
                    if (Test.bFld) break;
                    by -= (byte)-14615;
                    by += (byte)(((i8 * f) + i7) - i5);
                case 91:
                    by += (byte)1;
                    i5 += (((i8 * i5) + i5) - i7);
                    d += i8;
                    break;
                case 94:
                    i7 += i6;
                    break;
                case 90:
                    i5 *= (int)d;
                    break;
                }
            }
        }
        vMeth1_check_sum += i6 + i7 + i8 + i9 + by + Float.floatToIntBits(f) + Double.doubleToLongBits(d) +
            FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(int i, int i1, int i2) {

        int i3=14, i4=-10795, i10=23929, i11=11, i12=-26232, i13=-77, i14=-2, i15=216, iArr2[]=new int[N];
        float f2=-93.744F, fArr1[]=new float[N];

        FuzzerUtils.init(fArr1, -27.772F);
        FuzzerUtils.init(iArr2, 56518);

        for (i3 = 2; i3 < 187; i3++) {
            vMeth1();
            fArr1[i3] *= i;
            i2 ^= i;
            for (i10 = 1; i10 < 9; ++i10) {
                Test.instanceCount += Test.byFld;
            }
            iArr2[i3 + 1] ^= (int)Test.instanceCount;
            Test.instanceCount += (i3 * i3);
            i1 += (i3 + Test.instanceCount);
        }
        Test.instanceCount <<= Test.instanceCount;
        for (i12 = 1; i12 < 293; i12++) {
            for (i14 = i12; i14 < 6; i14++) {
                f2 *= f2;
                iArr2[i12 - 1] -= (int)1.54122;
                if (false) break;
            }
        }
        vMeth_check_sum += i + i1 + i2 + i3 + i4 + i10 + i11 + i12 + i13 + i14 + i15 + Float.floatToIntBits(f2) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)) + FuzzerUtils.checkSum(iArr2);
    }

    public static void vSmallMeth() {


        vMeth(Test.iFld, Test.iFld, Test.iFld);
        vSmallMeth_check_sum += 0;
    }

    public void mainTest(String[] strArr1) {

        double d1=-1.62580;
        int iArr[]=new int[N];
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr, 181);
        FuzzerUtils.init(fArr, 5.550F);

        Test.iFld = (int)(Test.instanceCount - (++Test.iFld));
        iArr[(24 >>> 1) % N] |= (int)((fArr[(0 >>> 1) % N] - (Test.iFld - Test.iFld)) - Test.instanceCount);
        for (int smallinvoc=0; smallinvoc<680; smallinvoc++) vSmallMeth();
        Test.iFld *= (int)1.942F;
        Test.sFld += (short)Test.iFld;
        d1 += Test.iFld;
        iArr[(-32 >>> 1) % N] = (int)Test.instanceCount;


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
//DEBUG  vMeth ->  vMeth vSmallMeth mainTest Test
//DEBUG  vMeth1 ->  vMeth1 vMeth vSmallMeth mainTest Test
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}