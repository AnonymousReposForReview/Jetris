package tests.javafuzzer1919;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 05:52:51 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-143L;
    public static int iFld=-14;
    public static volatile float fFld=39.764F;
    public static boolean bFld=true;
    public static float fArrFld[]=new float[N];
    public double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 17.988F);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i7, long l) {

        int i8=27136, i9=-4, i10=9, i11=-1944, i12=-52212, i13=-11, i14=14, iArr1[]=new int[N];
        double d1=2.41831;
        long l1=2272040484979876425L;

        FuzzerUtils.init(iArr1, -110);

        iArr1[(i8 >>> 1) % N] += (int)2469225695L;
        i9 = 1;
        do {
            Test.iFld += 14;
            for (i10 = 8; i10 > 1; i10--) {
                i8 -= i10;
                Test.iFld -= (int)l;
                for (i12 = 1; i12 < 2; i12++) {
                    i8 += (i12 * i10);
                    i8 += (int)253L;
                }
                d1 = i12;
                for (l1 = 1; l1 < 2; l1++) {
                    i8 -= i13;
                    if (i8 != 0) {
                        vMeth1_check_sum += i7 + l + i8 + i9 + i10 + i11 + i12 + i13 + Double.doubleToLongBits(d1) + l1
                            + i14 + FuzzerUtils.checkSum(iArr1);
                        return;
                    }
                    i8 = (int)l1;
                    i14 ^= -12;
                }
            }
        } while (++i9 < 194);
        vMeth1_check_sum += i7 + l + i8 + i9 + i10 + i11 + i12 + i13 + Double.doubleToLongBits(d1) + l1 + i14 +
            FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth(int i4, int i5) {

        short s1=-27379;
        int i6=193, i15=-244, i16=-1, i17=14500, i18=-3, iArr2[]=new int[N];
        double d2=-53.128963;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr2, 233);
        FuzzerUtils.init(lArr1, -3603963718060568479L);

        s1 = (short)((-89.16935 / ((--i5) | 1)) * i4);
        i6 = 1;
        while ((i6 += 3) < 172) {
            switch ((i6 % 4) + 54) {
            case 54:
                vMeth1(i6, Test.instanceCount);
                i5 += (i6 ^ i4);
                Test.instanceCount += (i6 + i4);
                i5 += Test.iFld;
                break;
            case 55:
                for (i15 = 1; i15 < 27; i15 += 3) {
                    for (i17 = 1; 4 > i17; i17++) {
                        switch ((((13 >>> 1) % 4) * 5) + 45) {
                        case 61:
                            i16 = (int)2000184756L;
                            break;
                        case 54:
                            Test.instanceCount >>>= i5;
                            break;
                        case 49:
                            Test.bFld = Test.bFld;
                            i16 = i17;
                            break;
                        case 50:
                            if (Test.bFld) continue;
                            break;
                        default:
                            Test.fArrFld[i6 + 1] -= 0.389F;
                        }
                    }
                }
                break;
            case 56:
                iArr2[i6] = (int)-1.851F;
                break;
            case 57:
                lArr1[i6 - 1] *= (long)d2;
                break;
            default:
                Test.instanceCount *= -12;
            }
        }
        long meth_res = i4 + i5 + s1 + i6 + i15 + i16 + i17 + i18 + Double.doubleToLongBits(d2) +
            FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth() {

        int i2=12, i3=1, i19=-163, i20=117, i21=182, i22=-58;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 887068507L);

        for (i2 = 7; i2 < 280; ++i2) {
            double d=-115.107716;
            boolean b=true;
            i3 *= 1872;
            lArr[i2 + 1] = (long)(d--);
            if (false) {
                Test.instanceCount += (((i2 * Test.instanceCount) + i2) - Test.fFld);
            } else if (true) {
                Test.iFld &= iMeth(i3, i2);
                if (b) continue;
                for (i19 = 1; 6 > i19; ++i19) {
                    if (Test.bFld) break;
                    lArr[i19] <<= i19;
                    for (i21 = 1; i21 < 2; ++i21) {
                        i22 -= 22;
                        i20 = (int)2.614F;
                        i20 += (i21 + Test.instanceCount);
                    }
                }
            } else {
                if (Test.bFld) continue;
            }
        }
        vMeth_check_sum += i2 + i3 + i19 + i20 + i21 + i22 + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        short s=-15926;
        int i=52713, i1=-9, i23=57208, i24=108, i25=-2, i26=-14, i27=81, i28=4, i29=13, i30=48500, i31=34146,
            iArr[]=new int[N];
        double d3=111.47660;
        byte by=122;

        FuzzerUtils.init(iArr, -5);

        iArr[(-12 >>> 1) % N] = (Test.iFld++);
        iArr[(48902 >>> 1) % N] /= (int)((-16217L - (Test.iFld + s)) | 1);
        for (i = 10; i < 268; i++) {
            vMeth();
            d3 = i1;
            for (i23 = 2; i23 < 97; i23++) {
                for (i25 = 1; i25 < 2; i25 += 2) {
                    s = (short)i26;
                    dArrFld[i23 - 1] *= -32399;
                }
                switch (((i % 2) * 5) + 36) {
                case 40:
                    by -= (byte)i1;
                    i24 ^= 14;
                    for (i27 = 1; i27 < 2; i27++) {
                        i26 = -39863;
                        Test.fFld += i24;
                        i28 = i;
                        Test.bFld = Test.bFld;
                        i26 -= by;
                        iArr[i23] &= (int)Test.instanceCount;
                        s += (short)-26.509F;
                        Test.iFld += i29;
                    }
                    iArr[i23] <<= i29;
                    break;
                case 46:
                    for (i30 = 1; i30 < 2; i30++) {
                        if (Test.bFld) continue;
                    }
                    dArrFld[i - 1] += s;
                    Test.fFld -= i;
                    Test.fFld = 70;
                    break;
                default:
                    i24 += (((i23 * i30) + i1) - Test.instanceCount);
                    Test.instanceCount += (i23 ^ (long)Test.fFld);
                    iArr[i23 + 1] = i26;
                }
            }
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}